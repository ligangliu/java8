package com.chen.optional;

import java.util.*;

/**
 * @Author liu
 * @Date 2018-12-11 22:50
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee("zhangsan");
        Employee employee1 = new Employee("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee,employee1);
        //company.setEmployees(employees);

        List<Employee> result = company.getEmployees();
//        if (null != result){
//            return result;
//        }else {
//            return new ArrayList<>();
//        }
        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(item -> item.getEmployees())
                .orElse(Collections.emptyList()));
    }
}

