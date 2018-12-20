package com.chen.stream;

import com.chen.methodreference.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @Author liu
 * @Date 2018-12-12 19:40
 */
public class Test9 {

    public static void main(String[] args) {
        //会发现这个程序会一直执行
//        IntStream.iterate(0, i -> (i+1) % 2)
//                .distinct()
//                .limit(6)
//                .forEach(System.out::println);

        //程序会正常结束
        IntStream.iterate(0, i -> (i+1) % 2)
                .limit(6)
                .distinct()
                .forEach(System.out::println);

    }

}
