package com.chen.mianshi.three2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 泛型问题
 * @Author liu
 * @Date 2018-12-19 21:36
 */
public class Test4 {

    public void method1(List<Object> list){

    }

    public void method3(List<? extends Object> list){

    }

    //? 就等同于 ? extends Object
    public void method4(List<?> list){

    }
    public void method2(){
        method1(new ArrayList<Object>());
        /**
         * 为什么下面的两行编译不能通过？
         * 原因分析：method1中实例的内容应该是Object,按照我们的理解String不是继承了Object了吗？
         *          但是关于泛型的继承问题
         *              ArrayList<Object>继承了List<Object>
         *              ArrayList<Object>却没有继承List<Object>
         *          所以下面的ArrayList<String>并没有继承List<Object>
         */
//        method1(new ArrayList<String>());
//        method1(new ArrayList<Integer>());

        method3(new ArrayList<Object>());
        //这下面两行就可以编译通过
        method3(new ArrayList<String>());
        method3(new LinkedList<Integer>());

        method4(new ArrayList<Object>());
        method4(new ArrayList<String>());
        method4(new LinkedList<Integer>());
    }

}
