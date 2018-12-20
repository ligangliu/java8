package com.chen.mianshi.four;

import java.util.Random;

/**
 * 多态问题：多态是一种编译时的行为，还是运行时的行为？
 * @Author liu
 * @Date 2018-12-19 21:50
 */
public class Test1 {

    public static void main(String[] args) {
        Test1 test = new Test1();
        /**
         * 多态是一种编译时的行为，还是运行时的行为？
         * 多态是一种运行时行为,通过下面的测试，我们就可以证明其是一种运行时的行为
         *  对于编译的时候我们根本就不知道generate会为我们返回哪一个子类的实例，只有在运行时才能确定其指向的那个子类的对象
         */
        Parent parent = test.generate();
        parent.doSomething();
    }

    public Parent generate() {
        Random random = new Random();
        int number = random.nextInt(3);
        System.out.println(number);
        switch (number){
            case 0: return new Child();
            case 1: return new Child2();
            case 2: return new Child3();
        }
        return null;
    }

}

class Parent {
    public void doSomething() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void doSomething() {
        System.out.println("Child");
    }

}

class Child2 extends Parent {
    @Override
    public void doSomething() {
        System.out.println("child2");
    }

}

class Child3 extends Parent {
    @Override
    public void doSomething() {
        System.out.println("child3");
    }

}