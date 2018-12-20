package com.chen.collector;

import com.chen.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author liu
 * @Date 2018-12-16 12:16
 */
public class Test6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().collect(Collectors.summingInt(item -> item )));

        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,30);
        Student student4 = new Student("zhangsan",20,40);
        Student student5 = new Student("lisi",90,40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);
        Map<String,Student> map = students.stream().
                collect(Collectors.toMap(Student::getName, value -> value,(value1,value2) -> value2));
        System.out.println(map);

        long result = list.parallelStream().collect(Collectors.counting());
        System.out.println(result);
    }

}
