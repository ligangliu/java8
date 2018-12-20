package com.chen.methodreference;

import com.chen.lambda.SupplierTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author liu
 * @Date 2018-12-12 9:36
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("wangwu",50);
        Student student3 = new Student("zhaoliu",40);
        Student student4 = new Student("lisi",90);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //使用lambda表达式
       // students.sort((s1, s2) -> Student.compareStudentByScore(s1,s2));
        //类名::静态方法
        //students.sort(Student::compareStudentByScore);

        //引用::方法
//        StudentComparator comparator = new StudentComparator();
//        students.sort(comparator::compareStudentByScore);

        //类名::实例方法名
        //compareStudentByScore实例方法一定是由引用调用的，所以它这里会将第一个参数调用，然后其他参数对作为参数传入
//        students.sort(Student::compareStudentByScore);

        List<String> cities = Arrays.asList("qingdao","chongqin","nanchang","guangzhou");
//        Collections.sort(cities,(c1,c2) -> c1.compareToIgnoreCase(c2));
//        Collections.sort(cities,String::compareToIgnoreCase);
//        cities.forEach(item -> System.out.println(item));

        students.forEach(item -> System.out.println(item));
        StudentTest test = new StudentTest();
        System.out.println(test.getString(String::new));
        System.out.println(test.getString2("xxx",String::new));
    }

    public String getString(Supplier<String> supplier){
        return supplier.get() + "test";
    }

    public String getString2(String arg, Function<String,String> function){
        return function.apply(arg);
    }
}
