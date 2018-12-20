package com.chen.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * @Author liu
 * @Date 2018-12-12 19:08
 */
public class Test7 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream
                .iterate(1,item -> item + 2)
                .limit(6);

        //System.out.println(stream.max((v1,v2) -> v1 - v2).orElseGet(() -> 0));

//        System.out.println(
//                stream.filter(value -> value > 2)
//                        .mapToInt(value -> value * 2)
//                        .skip(2)
//                        .limit(2)
//                        .sum());
//        IntSummaryStatistics summaryStatistics = stream.filter(value -> value > 2)
//                .mapToInt(value -> value * 2)
//                .skip(2)
//                .limit(2)
//                .summaryStatistics();
//        System.out.println(summaryStatistics.getCount());
//        System.out.println(summaryStatistics.getMax());
//        System.out.println(summaryStatistics.getMin());

//        System.out.println(stream);
//        System.out.println(stream.filter(item -> item > 2));
//        //会抛异常，流已经关闭了
//        //对stream重复操作了，而stream.filter会返回一个stream。所以其后面还可以对其操作
//        System.out.println(stream.distinct());

        System.out.println(stream);
        Stream stream1 = stream.filter(item -> item>2);
        System.out.println(stream1);
        Stream stream2 = stream1.distinct();
        System.out.println(stream2);
    }

}
