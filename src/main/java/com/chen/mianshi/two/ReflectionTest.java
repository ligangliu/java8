package com.chen.mianshi.two;

import java.lang.reflect.Field;

/**
 * @Author liu
 * @Date 2018-12-18 23:16
 */
public class ReflectionTest {
    /**
     * 获得某个类对应的Class对象的方法
     * 1.使用类的.class语法
     * 2.通过类的对象的getClass()方法
     * 3.通过Class对象的Class.forName()方法
     * 4.对于包装类，可以通过.type语法
     */
    public static void main(String[] args) throws Exception {
//        Integer.TYPE
        Class<?> clazz = PrivateTest.class;
        PrivateTest test = new PrivateTest();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
           // System.out.println(field.getName());
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(test,"chenliqi");
            }
        }
        System.out.println(test.getName());
    }
}
