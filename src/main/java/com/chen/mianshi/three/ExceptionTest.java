package com.chen.mianshi.three;

/**
 * 异常执行流程问题
 * @Author liu
 * @Date 2018-12-19 9:59
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            String s = null;
            /**
             * 在return之前会先去执行finally语句块
             */
            return;
            /**
             * System.exit(0)：表示终止虚拟机，而不会去执行finally语句块，所以只有这种情况会导致finally语句块不会执行
             */
           // System.exit(0);
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("finally");
        }
    }
}
