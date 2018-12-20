package com.chen.sourcecode;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author liu
 * @Date 2018-12-13 11:08
 */
public class Test1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",100);
        Student student4 = new Student("zhaoliu",90);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //将流转换成集合
//        List<Student> students1 = students.stream().collect(Collectors.toList());
//        students1.forEach(System.out::println);
        /**
         * collect方法分析:<R, A> R collect(Collector<? super T, A, R> collector);
         * collect：收集器
         * Collector:that
         *  收集输入结果累积到一个可变的结果容器中：它会再所有元素处理完毕后，将积累的结果转换为一个最终的表示
         *  它支持串行与并行两种方式
         *  Collectors本身提供了关于Collector的常见汇聚实现，Collectors本身实际上是一个工厂
         *
         * Collector：是一个接口
         *      public interface Collector<T, A, R>{
         *          Supplier<A> supplier();
         *      }
         *
         *
         */
        System.out.println("==============================");
        System.out.println("count: " + students.stream().collect(Collectors.counting()));
        System.out.println("count: " + students.stream().count());


    }
}
