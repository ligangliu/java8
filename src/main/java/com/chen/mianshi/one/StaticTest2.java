package com.chen.mianshi.one;

/**
 * 初始化顺序
 * 先执行父类的静态代码块，然后执行子类的静态代码块
 * 然后再执行父类的构造方法(当父类没有不带参数的构造方法,需要在子类的构造显示指明super(参数)来调用父类的构造方法，
 * 其实当子类中没有指明的时候，是默认有一个super()的来调用父类的构造方法的)，最后执行子类的构造方法
 * @Author liu
 * @Date 2018-12-18 22:50
 */
public class StaticTest2 {
    public static void main(String[] args) {
        new Child();
    }
}

class Parent {
    static String name = "hello";
    static {
        System.out.println("parent static block");
    }
    public Parent(){
        System.out.println("parent construtor");
    }

}

class Child extends Parent{
    static String childName = "world";
    static {
        System.out.println("child static block");
    }

    public Child(){
        System.out.println("child construtor");
    }
}
