package com.chen.lambda;

import java.util.function.Supplier;

/**
 * @Author liu
 * @Date 2018-12-11 19:34
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "陈立啟，你就是一个傻逼";
        System.out.println(supplier.get());
    }
}
