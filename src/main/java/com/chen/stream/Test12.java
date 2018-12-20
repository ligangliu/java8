package com.chen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 将单词分组(flatMap)，然后去重
 * @Author liu
 * @Date 2018-12-13 10:11
 */
public class Test12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList
                ("hello welcome","world hello","hello world hello","hello welcome");

        //map返回的是一个数组，而distinct是对一个数组去重。所以map并不能满足条件
//        list.stream().map(item -> item.split(" ")).distinct()
//                .forEach(item -> System.out.print(item + " "));
        //flatMap可以将Stream<String[]> 应该转换成Steam<String>
        list.stream().map(item -> item.split(" "))
                .flatMap(item -> Arrays.stream(item))
                .distinct()
                .forEach(System.out::println);

    }
}
