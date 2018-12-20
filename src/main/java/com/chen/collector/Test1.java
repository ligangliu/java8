package com.chen.collector;

import com.chen.stream.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 收集器
 * @Author liu
 * @Date 2018-12-15 16:51
 */
public class Test1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,30);
        Student student4 = new Student("zhangsan",20,40);
        Student student5 = new Student("lisi",90,40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);

        //找出分数最低的
        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore)))
        .ifPresent(System.out::println);
        //最大值
        students.stream().collect(Collectors.maxBy((s1,s2) -> s1.getScore() - s2.getScore()))
                .ifPresent(System.out::println);

        //求分数的平均值
        System.out.println(students.stream().collect(Collectors.averagingInt(Student::getScore)));
        //求分数的信息
        System.out.println(students.stream().collect(Collectors.summarizingInt(Student::getScore)));
        System.out.println("===============================================");

        //join
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",","<begin>","<end>")));
        System.out.println("===============================================");
        //多级分组
        Map<Integer,Map<String,List<Student>>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getScore,Collectors.groupingBy(Student::getName)));
        System.out.println(map);
        System.out.println("===============================================");

        //分区，大于80的在一个分区，小于80的在一个分区
        Map<Boolean,List<Student>> map1 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore()>80));
        System.out.println(map1);
        //多级分区
        Map<Boolean,Map<Boolean,List<Student>>>  map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore()>80,Collectors.partitioningBy(student -> student.getScore()>90)));
        System.out.println(map2);
        System.out.println("===============================================");

        //大于80的分区，然后统计每个分区的总个数
        Map<Boolean,Long> map3 = students.stream().
                collect(Collectors.partitioningBy(student -> student.getScore() > 80,Collectors.counting()));
        System.out.println(map3);


    }
}
