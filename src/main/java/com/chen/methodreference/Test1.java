package com.chen.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author liu
 * @Date 2018-12-12 9:27
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","word","chen");
        //list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);

    }
}


