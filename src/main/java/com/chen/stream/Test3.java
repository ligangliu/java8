package com.chen.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 将整型list中每个元素乘以2，在叠加求和
 * @Author liu
 * @Date 2018-12-12 10:51
 */
public class Test3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        int sum = 0;
//        for (Integer i : list){
//            sum += i * 2;
//        }
        System.out.println(list.stream()
                .map(value -> 2 * value)
                .reduce(0,(a,b) -> a + b));

    }

}
