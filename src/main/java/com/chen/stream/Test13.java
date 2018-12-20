package com.chen.stream;

import java.util.Arrays;
import java.util.List;

/**
 * flatMap：将多个结果打平，得到一个stream
 * @Author liu
 * @Date 2018-12-13 10:27
 */
public class Test13 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi","Hello","您好");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu");

        list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " -- " + item2))
                .forEach(System.out::println);
//        list1.stream().map(item -> list2.stream().map(item2 -> item + " -- " + item2))
//                .forEach(System.out::println);

    }
}
