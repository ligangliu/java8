package com.chen.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author liu
 * @Date 2018-12-12 11:07
 */
public class Test4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("chen","liu","yan");
//        String[] strings = stream.toArray(length -> new String[length]);
//        Arrays.asList(strings).forEach(value -> System.out.print(value + " "));
//        List<String> list = stream.collect(Collectors.toList());
//        LinkedList<String> linkedList = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
//        list.forEach(value -> System.out.print(value + " "));

//        List<String> list = stream.collect(Collectors.toCollection(() -> new LinkedList<>()));
//        System.out.println(list.getClass().getName());

//        Set<String> set = stream.collect(Collectors.toCollection(() -> new TreeSet<>()));
//        System.out.println(set.getClass().getName());

//        String str = stream.collect(Collectors.joining(","));
//        System.out.println(str);


    }

}
