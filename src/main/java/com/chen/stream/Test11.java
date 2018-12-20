package com.chen.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 流的短路
 * @Author liu
 * @Date 2018-12-13 9:58
 */
public class Test11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1","world","hello world");
        list.stream().filter(item -> {
            int length = item.length();
            //这里只会打印输出hello,对于world并不会打印(流短路运算)
            //这也就验证了，steam的底层并不会执行执行多个for，也就是第一个元素再filter运行完后，会再findFirst运行
            //stream先找到第一个元素，发现其符合操作，就不会执行后面的啦。比如把hello改成hello的话就会打印出hello1和world
            System.out.println(item);
            return length == 5;
        }).findFirst().ifPresent(item -> System.out.println(item + " -- " + item.length()));
    }
}
