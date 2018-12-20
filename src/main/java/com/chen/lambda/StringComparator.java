package com.chen.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author liu
 * @Date 2018-12-11 16:34
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
        Collections.sort(names, Comparator.comparing((String v1) -> v1));
        System.out.println(names);

        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);


    }
}
