package com.chen.stream;

import java.util.stream.IntStream;

/**
 * @Author liu
 * @Date 2018-12-12 10:47
 */
public class Test2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{5,6,7}).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("=============================");
        IntStream.range(3,8).forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("=============================");
        IntStream.rangeClosed(3,8).forEach(value -> System.out.print(value + " "));

    }

}
