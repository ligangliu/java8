package com.chen.optional;

import java.util.*;

/**
 * @Author liu
 * @Date 2018-12-11 22:50
 */
public class OptionalTest1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        if (optional.isPresent()){
            System.out.println(optional.get());
        }

        //推荐采用函数式编程
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("==========================");
        System.out.println(optional.orElse("xxxx"));
        System.out.println("==========================");
        System.out.println(optional.orElseGet(() -> "陈立啟，傻逼"));
        List<Employee> list = new ArrayList<>();
        Collections.sort(list,(e1,e2) -> e1.getName().compareTo(e2.getName()));
        Collections.sort(list,Comparator.comparing(value -> value.getName()));
    }

}
