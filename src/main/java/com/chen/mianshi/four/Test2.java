package com.chen.mianshi.four;

import java.util.Arrays;

/**
 * 数组问题
 * @Author liu
 * @Date 2018-12-19 22:10
 */
public class Test2 {
    public static void main(String[] args) {
        char[] ch1 = new char[2];
        ch1[0] = 'a';
        ch1[1] = 'b';

        char[] ch2 = new char[2];
        ch2[0] = 'a';
        ch2[1] = 'b';
        /**
         * 其调用的父类Object的equals方法，
         * 由于数组是一种极特殊的对象，我们没有办法重写其equals方法
         * 如果想比较数组是否一致，
         *  1.我们可以通过构造String的方法实现
         *  2.也可以通过使用Arrays类来比较
         *  3.比较笨的方法，也可以循环遍历数组一个一个比较
         */
        System.out.println(ch1.equals(ch2));//false

        String s1 = new String(ch1);
        String s2 = new String(ch2);
        System.out.println(s1.equals(s2));

        System.out.println(Arrays.equals(ch1,ch2));

    }
}
