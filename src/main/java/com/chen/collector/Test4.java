package com.chen.collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * 自定义收集2
 *  输入：Set<String>
 *  输出：Map<String, String>
 *  式列：["hello","chen"]   {"hello":"hello","chen":"chen"}
 * @Author liu
 * @Date 2018-12-15 19:43
 */
public class Test4<T> implements Collector<T, Set<T>, Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("combiner invoked!");
        return (set, item) -> {
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
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

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("chen","chen","liu","liu");
        Set<String> set = new HashSet<>();
        set.addAll(list);

        Map<String,String> map = set.stream().collect(new Test4<String>());
        System.out.println(map);
    }
}
