package com.chen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author liu
 * @Date 2018-12-11 18:56
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 test = new PredicateTest2();
        test.conditionFilter(list,value -> value % 2 == 0);
        test.conditionFilter(list,value -> value > 6);
        test.conditionFilter(list,value -> true);
        test.conditionFilter2(list,value -> value % 2 ==0,value -> value > 5);
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        list.forEach(value -> { if (predicate.test(value)) System.out.print(value + " ");});
        System.out.println();
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1,Predicate<Integer> predicate2){
        list.forEach(value -> { if (predicate1.and(predicate2).test(value)) System.out.print(value + " ");});
        System.out.println();
    }

}
