package com.chen.mianshi.three;

import java.util.ArrayList;
import java.util.List;

/**
 * equals与==的关系：千万别简单回答==比较的是地址，而equals比较的是内容
 * @Author liu
 * @Date 2018-12-19 10:41
 */
public class EqualsTest {
    public static void main(String[] args) {
        String str = new String("abc");
        String str2 = new String("abc");
        System.out.println(str == str2);
        /**
         * 在这里String中该equals方法进行了重写
         */
        System.out.println(str.equals(str2));

        Object object = new Object();
        Object object2 = new Object();
        System.out.println(object == object2);
        /**
         * 会发现这里返回false
         * 查看源码Object中的equals：
         *      public boolean equals(Object obj) {
         *          //有没有发现这里equals比较的是地址了呀
         *         return (this == obj);
         *     }
         */
        System.out.println(object.equals(object2));

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println(list == list1);
        /**
         * 这里返回的也是true
         *  其中AbstractList中也对该equals方法进行了重写
         */
        System.out.println(list.equals(list1));

        Person p1 = new Person("chen");
        Person p2 = new Person("chen");
        System.out.println(p1 == p2);
        //这里并没有重写equals方法，所以根据多态原则会调用父类Object的equals方法
        System.out.println(p1.equals(p2));//false
    }

}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
