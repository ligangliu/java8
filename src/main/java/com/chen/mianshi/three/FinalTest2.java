package com.chen.mianshi.three;

/**
 * final引用类型变量问题
 * @Author liu
 * @Date 2018-12-19 9:55
 */
public class FinalTest2 {

    /**
     * final对于引用类型的变量，所谓的不能改变是指该引用不能改变，而不是该引用所指向的对象的内容是可以改变的
     *
     */
    private static final StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        //所以这里是可以编译通过的
        sb.append("xxxx");
    }

}
