package com.chen.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 分组与分区(分组的一个特殊)操作
 * @Author liu
 * @Date 2018-12-13 10:37
 */
public class Test14 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,30);
        Student student4 = new Student("zhangsan",20,40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //=====================如按姓名分组===========================
        //命令方式实现
        // Map<Sting,List<Student>>
        // 1.循环列表
        // 2.取出学生的名字
        // 3.检查map中是否存在map,不存在就添加，存在先取出List<Student>，然后再list中添加student

        //stream的操作方式
//        Map<String,List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        //select * from student group by name;
//        Map<String,List<Student>> map = students.stream().collect(Collectors.groupingBy(item -> item.getName()));
//        for (Map.Entry<String,List<Student>> entry:map.entrySet()){
//            System.out.println(entry.getKey() + " -- " + entry.getValue().size());
//        }

        //select count(*) from student group by name;
//        Map<String,Long> map = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        for (Map.Entry<String,Long> entry:map.entrySet()){
//            System.out.println(entry.getKey() + " -- " + entry.getValue());
//        }

        //select avg(score) from student group by name;
//        Map<String,Double> map = students.stream()
//                .collect(Collectors.groupingBy(Student::getName,
//                        Collectors.averagingDouble(Student::getScore)));
//
//        for (Map.Entry<String,Double> entry:map.entrySet()){
//            System.out.println(entry.getKey() + " -- " + entry.getValue());
//        }

        //分区,要么true，要么false
        List<Student> list = students.stream().collect(Collectors.toList());
        Map<Boolean,List<Student>> map = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map);
        System.out.println(map.get(true).size());

    }

}
