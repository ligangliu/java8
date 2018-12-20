package com.chen.mianshi.three;

/**
 * 一个类是否既可以时abstract又被final修饰？
 * 原因分析：由于abstract类不能被初始化，如果想初始化的话，必须初始化其子类，
 *          而final修饰的类又是不能被继承的类，所以这两者会矛盾
 *
 * @Author liu
 * @Date 2018-12-19 10:33
 */
public abstract /**final**/ class abstractTest {
}
