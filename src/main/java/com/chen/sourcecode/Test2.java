package com.chen.sourcecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 关闭流测试onClose
 *  某一个处理器流关闭抛出了异常，并不会影响其他的处理流的关闭
 * @Author liu
 * @Date 2018-12-16 13:39
 */
public class Test2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("liu","chen","zhang");
        try(Stream<String> stream = list.stream()){
            stream.onClose(() -> {
                System.out.println("aaa");
                throw new NullPointerException("xxx");
            }).onClose(() -> {
                System.out.println("bbbb");
            }).forEach(System.out::println);
        }


    }

}
