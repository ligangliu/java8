package com.chen.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author liu
 * @Date 2018-12-17 16:32
 */
public class OptionalTest3 {
    public static void main(String[] args) {
        Company company = new Company();
        company.setEmployees(Arrays.asList(new Employee()));
        if (null != company){
            List<Employee> employees = company.getEmployees();
            if (null != employees){
                String name = employees.get(0).getName();
                if (null != name && !"".equals(name)){
                    //do something
                }
            }
        }

        Optional.ofNullable(company).map(Company::getEmployees).map(value -> value.get(0).getName())
        .filter(name -> !"".equals(name)).ifPresent(name -> {
            System.out.println(name);
        });
        Company com = Optional.ofNullable(company).get();
       // System.out.println(com);
    }
}
