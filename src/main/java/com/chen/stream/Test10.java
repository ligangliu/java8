package com.chen.stream;

import java.util.*;

/**
 * 串行流与并行流
 * @Author liu
 * @Date 2018-12-12 21:51
 */
public class Test10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("==========开始排序==============");
        long start = System.currentTimeMillis();
       // list.stream().sorted().count();  //7122毫秒
        list.parallelStream().sorted().count();  //花费1827毫秒

        long end = System.currentTimeMillis();
        System.out.println("排序花费时间：" + (end - start) + "毫秒");
    }
}
