package com.chen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流的创建
 * @Author liu
 * @Date 2018-12-12 10:31
 */
public class Test1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello","chenliqi","liulignag");

        String[] myArray = new String[]{"hello","chenliqi","liulignag"};
        Stream stream2 = Stream.of(myArray);

        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList();
        Stream stream4 = list.stream();

    }

}
