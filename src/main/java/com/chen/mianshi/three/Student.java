package com.chen.mianshi.three;

import java.util.HashSet;

/**
 * hashCode：当类中仍然包有类的时候
 * @Author liu
 * @Date 2018-12-19 11:17
 */
public class Student {
    private String name;
    private Integer age;

    private Person person;

    public Student(String name, Integer age, Person person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        if (getAge() != null ? !getAge().equals(student.getAge()) : student.getAge() != null) return false;
        return getPerson() != null ? getPerson().equals(student.getPerson()) : student.getPerson() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        Person person = new Person("xxx");
        Person person1 = new Person("xxx");

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

        Student s1 = new Student("xx",12,person);
        Student s2 = new Student("xx",12,person1);
        hashSet.add(s1);
        hashSet.add(s2);
        System.out.println(hashSet.size());
    }
}
