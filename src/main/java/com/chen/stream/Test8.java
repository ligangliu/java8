package com.chen.stream;

import java.util.Arrays;
import java.util.List;

/**
 * stream的中间操作与终止操作的区别
 * @Author liu
 * @Date 2018-12-12 19:32
 */
public class Test8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("chen","liu","yan");
//        list.stream().map(item -> item.substring(0,1).toUpperCase() + item.substring(1))
//                .forEach(value -> System.out.print(value + " "));

        //也就是中间操作再没有遇到终止操作的时候，其是一个延迟的，里面的代码并不会执行
//        list.stream().map(item -> {
//            String result = item.substring(0,1).toUpperCase() + item.substring(1);
//            System.out.println("test");
//            return result;
//        });

        list.stream().map(item -> {
            String result = item.substring(0,1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(value -> System.out.print(value + " "));


    }
}
