package com.chen.lambda;

import java.util.function.Supplier;

/**
 * @Author liu
 * @Date 2018-12-11 19:36
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());
        System.out.println("=================================");
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());

    }
}
