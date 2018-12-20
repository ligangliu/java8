package com.chen.mianshi.three;

/**
 * 捕获异常
 * @Author liu
 * @Date 2018-12-19 10:13
 */
public class ExceptionTest2 {

    public void doSomething() throws ArithmeticException {
        System.out.println("do something...");
    }
    public void doSomething2() throws Exception {
        System.out.println("do something2...");
    }

    public static void main(String[] args) {
        ExceptionTest2 test = new ExceptionTest2();
        /**
         * 编译能够通过
         * 原因分析：由于ArithmeticException是运行时异常，并不强制我们捕获或抛出
         *          但是对于受检查异常，消极做法，继续往外抛出，可以直到抛到jvm处理
         *         自己可以try catch 处理异常
         */
        test.doSomething();

        //Exception时受检查异常与运行时异常的父类，所以我们必须对其捕获或往外抛
//        test.doSomething2();

    }
}
