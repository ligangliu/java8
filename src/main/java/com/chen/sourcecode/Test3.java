package com.chen.sourcecode;

import java.util.Arrays;
import java.util.List;

/**
 * @Author liu
 * @Date 2018-12-16 13:51
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("chen","liu","yan","li","qi");
       // list.parallelStream().forEach(System.out::println);
        list.stream().forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(2,3,4,1,6);
        list1.stream().map(i -> 2 * i).filter(i -> i>4).forEach(i -> System.out.print(i + " "));

    }

}
