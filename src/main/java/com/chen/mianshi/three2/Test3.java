package com.chen.mianshi.three2;

import java.util.Date;

/**
 * java中的内部类
 * @Author liu
 * @Date 2018-12-19 21:24
 */
public class Test3 {

    public static void main(String[] args) {
        Test3 test = new Test3();
        /**
         * 1.静态内部类
         * 2.成员内部类
         * 3.局部内部类
         * 4.匿名内部类
         */
        String result = test.get(new Date(){
            @Override
            public String toLocaleString() {
                return "xxxxxxxxxxxxx";
            }
        });
        System.out.println(result);
    }

    @SuppressWarnings("deprecation")
    public String get(Date date){
        return date.toLocaleString();
    }

}
