package com.chen.lambda;

import java.util.function.Function;

/**
 * @Author liu
 * @Date 2018-12-11 16:51
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(3,value -> 2 * value));
        System.out.println(test.compute(6,value -> 6 + value));
        System.out.println(test.convert(5,value -> String.valueOf(value + " 陈立啟，你就是一个傻逼")));

    }

    public int compute(int a, Function<Integer, Integer> function){
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function){
        return function.apply(a);
    }
}
