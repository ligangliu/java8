package com.chen.spliterator;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @Author liu
 * @Date 2018-12-16 14:38
 */
public class Test1 {

    public static void main(String[] args) {
        Test1 test = new Test1();

        Consumer<Integer> consumer = integer -> System.out.println(integer);
        IntConsumer intConsumer = integer -> System.out.println(integer);

        System.out.println(consumer instanceof Consumer);
        System.out.println(intConsumer instanceof Consumer);

        test.test(consumer); //面向对象的方式
        test.test(consumer::accept); //函数式的方式
//        test.test(intConsumer);  //报错
        test.test(intConsumer::accept);
    }

    public void test(Consumer<Integer> consumer){
        consumer.accept(100);
    }

}
