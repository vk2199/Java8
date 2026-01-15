package com.java8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee(1010,"Vivek Kushwaha","vivek@gmail.com","IT",56000),
                new Employee(1110,"Ramesh Kumar","Ramesh@gmail.com","HR",46000)
        );

        //Find the size of employee
        int size = employeeList.size();
        System.out.println("Employee size: "+size);
    }
}
