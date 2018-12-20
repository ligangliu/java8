package com.chen.mianshi.four;

import java.util.concurrent.TimeUnit;

/**
 * 两个线程输出：01010101010101...
 * @Author liu
 * @Date 2018-12-19 22:17
 */
public class Test3 {

    int count = 0;
    public synchronized void add(){
        try {
            while (count == 1){
                this.wait();
            }
            TimeUnit.SECONDS.sleep(2);
            count++;
            System.out.println(Thread.currentThread().getName() + " count: " + count);
            this.notifyAll();
        }catch (InterruptedException e){}
    }

    public synchronized void sub(){
        try {
            while (count == 0){
                this.wait();
            }
            TimeUnit.SECONDS.sleep(2);
            count--;
            System.out.println(Thread.currentThread().getName() + " count: " + count);
            this.notifyAll();
        }catch (InterruptedException e){}
    }

    public static void main(String[] args) {
        Test3 test = new Test3();
        new Thread(() -> {
            while (true){
                test.add();
            }
        },"t1").start();

        new Thread(() -> {
            while (true){
                test.sub();
            }
        },"t2").start();
    }

}
