package com.chen.collector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 比较器
 * @Author liu
 * @Date 2018-12-15 17:26
 */
public class Test2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("nihao","chen","li","qi","ai");
        Collections.sort(list);
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
        Collections.sort(list,(item1,item2) -> item1.length() - item2.length());
//        System.out.println(list);
        Collections.sort(list, Comparator.comparingInt(item -> item.length()));
        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        System.out.println(list);

        /**
         * 会发现下面的方法报错，报错的原因就是item在这里推断为Object类型
         *  Collections.sort(list, Comparator.comparingInt(item -> item.length()).reversed());
         * 参数推断出错的原因分析
         *comparingInt(ToIntFunction<? super T> keyExtractor)：我们可以看到这个函数，其参数类型是<T>及其以上的
         * 编译器是无法确定T的类型，那么只能把其当成Object类型了，但是Object类型并没有length方法，所以编译器编译
         * 通不过。
         */

        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

        //多层的比较
        //Collections.sort();
        Collections.sort(list, Comparator.comparingInt(String::length)
                .thenComparing(String.CASE_INSENSITIVE_ORDER).reversed());

        System.out.println(list);


    }
}
