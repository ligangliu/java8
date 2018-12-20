package com.chen.mianshi.three2;

/**
 * 符号运算：&与&&
 * @Author liu
 * @Date 2018-12-19 21:17
 */
public class Test2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        /**
         * &：按位与
         * 011
         * 101
         * 001
         */
        int c = a & b;
        System.out.println(c);

        int a1 = 1;
        int b1 = 2;
        //&&：短路运算
        //&：也可以做逻辑与，但是其不会短路
        if ((a1==2) /**&**/& ((b1 = 3) == 5)){
            System.out.println("execution");
        }
        System.out.println(a1 + " - " + b1);

    }
}
