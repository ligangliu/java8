package com.chen.mianshi.three;

/**
 * final变量的初始化问题
 * @Author liu
 * @Date 2018-12-19 9:43
 */
public class FinalTest {
    /**
     * 对于final成员变量的初始化
     * 1.声明变量时进行赋值
     * 2.在构造方法中进行赋值,如果final变量声明时没有进行赋值的话，
     *   那么在所有的构造方法中都需要确保final变量被初始化了
     *
     * 但是如果final变量是static的话，表明这个变量在尚未实例化的时候就需要存在并赋值，
     * 但是由于final编译器并不会为其赋值，所以对于static的final变量只能在声明的时候对其赋值
     */
    private final int a;

    public FinalTest(){
        this.a = 10;
    }

    public FinalTest(String name){
        this.a = 10;
    }

}
