package com.chen.mianshi.one;

/**
 * 字符串相关
 * @Author liu
 * @Date 2018-12-18 21:51
 */
public class StringTest {

    public static void main(String[] args) {
        //在内存中生成几个对象？
        /**
         * 需要根据具体情况来分析
         * abc在String pool中，一开始String池中并没有内容为abc的对象，所以会在String pool中创建该对象，
         * 如果String pool中有内容为abc的字符串的话就不会在String pool中创建对象了
         * new String("abc")的时候， 会在堆中生成一个abc的对象
         */
        String s = new String("abc");
        //会从String pool中去查找有没有内容为abc的对象，如果有的话将s1引用指向String pool中字符串
        String s1 = "abc";
        //String pool中有内容为abc的对象，就不会创建了，然后只要遇到了new的时候就会在堆中生成一个对象
        String s2 = new String("abc");
        System.out.println(s == s1); //false
        System.out.println(s == s2); //false
        System.out.println(s1 == s2); //false

        //intern()，返回string pool中的字符串
        //如s.intern(),如果string pool中有该字符串就返回该字符串的地址
        System.out.println(s == s.intern()); //false
        System.out.println(s1 == s1.intern()); //true
        System.out.println(s.intern() == s2.intern());//true

        System.out.println("==================================================");
        String hello = "hello";
        String hel = "hel";
        String lo = "lo";
        //当+两边都是常量，得到一个字符串后会去字符串池中去查找返回
        System.out.println(hello == "hel" + "lo");
        //当+两边只要有变量，java会在堆中生成新的对象
        System.out.println(hello == "hel" + lo);
        System.out.println(hello == hel + lo);

    }

}
