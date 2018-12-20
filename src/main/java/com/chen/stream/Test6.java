package com.chen.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author liu
 * @Date 2018-12-12 18:54
 */
public class Test6 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a","b","c");
       // System.out.println(stream.findFirst().get());

        stream.findFirst().ifPresent(value -> System.out.println(value));

        //生成一个无限的串行流
        Stream.iterate(1,item -> item + 2)
                .limit(6)
                .forEach(value -> System.out.print(value + " "));
    }

}
