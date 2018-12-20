package com.chen.collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * 自定义收集2：并行流
 *  输入：Set<String>
 *  输出：Map<String, String>
 *  式列：["hello","chen"]   {"hello":"hello","chen":"chen"}
 * @Author liu
 * @Date 2018-12-15 19:43
 */
public class Test5<T> implements Collector<T, Set<T>, Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("combiner invoked!");
        return (set, item) -> {
            System.out.println("accumulator: " + set + " "+ Thread.currentThread().getName());
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            System.out.println("combiner: " + Thread.currentThread().getName());
            System.out.println("set1: " + set1);
            System.out.println("set2: " + set2);
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");
        return set -> {
           Map<T,T> map = new HashMap<>();
           set.stream().forEach(item -> map.put(item,item));
           return map;
        };
    }

    /**
     * UNORDERED：结果容器不需要有序的，如set,如list的前后就是有序的，其最后的结果就是不能乱序的
     * CONCURRENT：在多线程执行的时候，会操作同一个结果容器，那么就不需要合并啦，但是如果结果容器是非现场安全的话，有可能出现异常
     *             如果没有CONCURRENT，那么每个线程都会又自己的结果容器，这样的话最后就需要combiner啦
     * IDENTITY_FINISH：表示中间结果A与最后的返回结果R是相同的，就不需要执行finisher方法,在此实验中中间结果：A Set<T> ，最后结果R Map<T,T>
     * @return
     */
    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("chen","chen","liu","liu","zah","b","c","d","e");
        Set<String> set = new HashSet<>();
        set.addAll(list);

        Map<String,String> map = set.parallelStream().collect(new Test5<String>());
        System.out.println(map);
    }
}
