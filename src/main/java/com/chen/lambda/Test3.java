package com.chen.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Author liu
 * @Date 2018-12-11 15:56
 */
public class Test3{
    public static void main(String[] args) {
        //MyInterface1 interface1对于() -> {}来说就是一个上下文
        MyInterface1 interface1 = () -> {};
        System.out.println(interface1.getClass().getInterfaces()[0]);

        MyInterface2 interface2 = () -> {};
        System.out.println(interface2.getClass().getInterfaces()[0]);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("xxxxxxxxxxxxxxxxxxxxx");
            }
        }).start();

        new Thread(() -> {
            System.out.println("yyyyyyyyyyyyyyyyyyy");
        }).start();

        List<String> list = Arrays.asList("hello","word","hello word");
//        List<String> upperList = new ArrayList<>();
//        list.forEach(item -> upperList.add(item.toUpperCase()));
//        upperList.forEach(item -> System.out.println(item));

        //stream的方式
//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
//        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

//        Function<String, String> function = String::toUpperCase;
//        System.out.println(function);
//        System.out.println(function.getClass().getInterfaces()[0]);



    }
}

@FunctionalInterface
interface MyInterface1 {
    void myMethod1();
}

@FunctionalInterface
interface MyInterface2 {
    void myMethod2();
}