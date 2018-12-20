package com.chen.mianshi.one;

/**
 * @Author liu
 * @Date 2018-12-18 22:40
 */
public class StaticTest {

    private static StaticTest st = new StaticTest();

    public static int count1;

    public static int count2 = 0;

    private StaticTest(){
        count1++;
        count2++;
    }

    public static StaticTest getInstanc(){
        return st;
    }
    public static void main(String[] args) {
        /**
         * 对于静态的执行顺寻肯定是从上到下，我们遇到new StaticTest()的时候会加载该class,然后回把一切变量赋值为默认值，
         *    然后遇到了new StaticTest()回将count1,count2加1,然后执行到count2 =0的时候回为count2重新赋值
         * 然后执行public static int count2 = 0;其需要赋值
         * 如果将private static StaticTest st = new StaticTest();放在count1与count2后面，会发现输出的就是两个都是1啦
         */
        StaticTest test = StaticTest.getInstanc();
        System.out.println("count1: " + count1); //1
        System.out.println("count2: " + count2); //0
    }

}
