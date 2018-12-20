package com.chen.mianshi.two;

/**
 * 问题：是否可以修改name的属性？
 * 答案：可以，通过反射可以实现
 * @Author liu
 * @Date 2018-12-18 23:12
 */
public class PrivateTest {

    private /**final**/ String name = "hello";

    public String getName(){
        return name;
    }

}
