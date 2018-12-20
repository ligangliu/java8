package com.chen.mianshi.three;

import java.io.IOException;

/**
 * 多个catch语句块执行问题
 * @Author liu
 * @Date 2018-12-19 10:26
 */
public class ExceptionTest3 {

    public void doSomething()  throws IOException{
        System.out.println("do something...");
    }

    public static void main(String[] args) {
        ExceptionTest3 test = new ExceptionTest3();
        try {
            test.doSomething();
        }catch (Exception ex){

        }
        /**
         * 为什么这里编译不能通过？
         * 原因分析：当catch语句有多个的话，会从上至下匹配，如果匹配成功就会忽略下面的所有的catch语句块
         *          所以上面的catch语句块范围比下面还大的话，那下面的catch语句块就没有意义啦
         */
        /**catch (IOException e){

        }**/

    }

}
