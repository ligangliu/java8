package com.chen.lambda;

import java.util.function.Predicate;

/**
 * @Author liu
 * @Date 2018-12-11 18:51
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello1"));

        new PredicateTest().filter("hello1",value -> value.length() > 5);
    }

    public void filter(String string, Predicate<String> predicate){
        System.out.println(predicate.test(string));
    }
}
