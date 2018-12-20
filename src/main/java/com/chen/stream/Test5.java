package com.chen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author liu
 * @Date 2018-12-12 17:10
 */
public class Test5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("chen","liu","yan");

//        list.forEach(value -> System.out.println(value.toUpperCase()));

        list.stream().map(value -> value.toUpperCase())
              //  .collect(Collectors.toList())
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("==========================");

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().map(value -> value * value).forEach(value -> System.out.print(value + " "));

        System.out.println();
        System.out.println("==========================");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1),Arrays.asList(2,3)
                ,Arrays.asList(4,5));
        stream.flatMap(theList -> theList.stream())
                //在这个map的item类型时Integer类型
                .map(item -> item * item)
                .forEach(value -> System.out.print(value + " "));


    }

}
