package com.chen.mianshi.three;

/**
 * @Author liu
 * @Date 2018-12-19 10:38
 */
public class FinalTest3 {
    /**
     * 问题衍生：为什么对于一个public类型的终态的成员变量，一般都要声明为static的？
     * 原因分析：节省内存，由于final的变量是只读的，那么如果不用static变量修饰的话，那么有100个实例的话，就会存储100分
     *          而这个又是一个只读的，我们用static修饰的话，那么100个实例也就是只有一份
     */
    public static final String str = "xxx";
}
