package com.chen.mianshi.three2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * hashCode方法，equals方法，HashSet,HashMap之间的关系？
 * @Author liu
 * @Date 2018-12-19 20:52
 */
public class Test1 {

    public static void main(String[] args) {
        /**
         * HashSet的构造方法，我们可以看到HashSet的底层是构造了HashMap
         * public HashSet() {
         *     map = new HashMap<>();
         * }
         * 所以所有的value都是一个Object的常量对象
         * // Dummy value to associate with an Object in the backing Map
         * private static final Object PRESENT = new Object();
         * public boolean add(E e) {
         *    return map.put(e, PRESENT)==null;
         * }
         */
        HashSet set = new HashSet();
        set.add("xxx");
        HashMap map = new HashMap();
        map.put("xx","xx");

    }

}
