package com.chen.lambda;

/**
 * @Author liu
 * @Date 2018-12-11 14:46
 */
@FunctionalInterface
interface MyInterface{
    void test();
    String toString();
}
public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });

        System.out.println("==============================");

        test2.myTest(() -> {
            System.out.println("mytest");
        });

        MyInterface myInterface = () -> {
            System.out.println("mytest");
        };

        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);

    }

    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }
}
