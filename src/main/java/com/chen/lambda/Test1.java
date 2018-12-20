package com.chen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author liu
 * @Date 2018-12-11 14:08
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (Integer i:list){
            System.out.print(i + " ");
        }
        System.out.println();
        //Consumer是一个函数式接口
        //@FunctionalInterface
        //public interface Consumer<T> {}
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });
        System.out.println();

        list.forEach(integer -> {
            System.out.print(integer + " ");
        });


    }
}
