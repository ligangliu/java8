package com.chen.optional;

import java.util.List;

/**
 * @Author liu
 * @Date 2018-12-17 15:36
 */
class Company {
    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
