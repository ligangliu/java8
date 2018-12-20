package com.chen.mianshi.three;

/**
 * 数组相关的问题
 * @Author liu
 * @Date 2018-12-19 10:03
 */
public class ArrayTest {

    public static void main(String[] args) {
        /**
         * 在这里是可以编译通过的，我们知道接口是不能被初始化的，但是这里为什么能够编译通过呢？
         * 原因分析：数组本身是一个对象，但是数组里面存放的是一个引用，引用指向相关的对象的地址，如果没有指向，默认是null
         *          其实不光是数组，集合中也是如此。
         */
        I[] i = new I[2];
        System.out.println(i[0]);//null：表示数组里面的引用什么都没有指向
        System.out.println(i[1]);//null
        //接口不能被初始化
        //I i = new I();
    }

}

interface I{

}
