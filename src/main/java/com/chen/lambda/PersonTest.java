package com.chen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Author liu
 * @Date 2018-12-11 18:23
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",20);
        Person person2 = new Person("lisi",30);
        Person person3 = new Person("wangwu",40);
        List<Person> persons = Arrays.asList(person1,person2,person3);
        PersonTest test = new PersonTest();
        List<Person> result = test.getPersonByUseranme("zhangsan",persons);
        //result.forEach(person -> System.out.println(person));

        List<Person> result2 = test.getPersonByAge(28,persons,(age,personList) ->
                personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList()));
        result2.forEach(person -> System.out.println(person));

    }

    public List<Person> getPersonByUseranme(String username,List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age,List<Person> persons,
                                       BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,persons);
    }



}
