package com.chen.mianshi.three;

import java.util.HashSet;

/**
 * @Author liu
 * @Date 2018-12-19 10:55
 */
public class SetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("xyz");
        set.add("abc");
        /**
         * HashSet：添加元素，先获取元素的hashCode，如果没有重写hashCode方法的话，
         *         就会调用父类Object中的hashCode,而Object中hashCode方法是一个native方法,
         *         它是根据对象的地址来生成hashcode,也就是说不同地址的对象所生成的hashCode码肯定是不一样的，
         *          可以理解为hashCode就是对应内存地址
         *         但是我们在类中重写
         *              @Override
         *              public int hashCode() {
         *                  int result = getName() != null ? getName().hashCode() : 0;
         *                  result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
         *                  result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
         *                  return result;
         *              }
         *       会将类中的所有元素的hashCode使用31 * 元素的hashCode再累加返回
         *       重写equeals，如果没有重写equals就会默认调用父类Object的equals方法
         *              @Override
         *              public boolean equals(Object o) {
         *                  if (this == o) return true;
         *                  if (o == null || getClass() != o.getClass()) return false;
         *                  Person person = (Person) o;
         *                  return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
         *              }
         *      所以只要把握了hashCode与equals的原理，无论怎么变化，我们都可以了解其背后的东西啦
         *
         */
        HashSet<Person> set2 = new HashSet<>();
        set2.add(new Person("zzz"));
        set2.add(new Person("cccc"));
        set2.add(new Person("zzz"));
        System.out.println(set2.size());

        System.out.println(new Person("aa").hashCode());
        System.out.println(new Person("aa").hashCode());
        Person p1 = new Person("aa");
        Person p2 = p1;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}


