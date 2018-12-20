package com.chen.mianshi.two;

/**
 * 父子类的异常关系
 *
 * @Author liu
 * @Date 2018-12-18 23:02
 */
public class Test {
}

class Parent {
    public void output() throws NullPointerException {
        System.out.println("parent");
    }
}
class Child extends Parent {
    /**
     * 方法重写的要求：
     *  1.子类的方法与父类中的方法有相同的返回类型，相同的方法名称，相同的参数列表
     *  2.子类的访问级别不能低于父类中该方法的访问级别(如果低了的话，多态的话，我们Parent parent = new Child()
     *   其都有可能不能调用子类的多态方法了)
     *  3.子类的异常不能大于父类抛出的异常
     * @throws Exception
     */
    public void output() /**throws Exception**/ {
        System.out.println("child");
    }

}
