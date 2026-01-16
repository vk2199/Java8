package com.java8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee(1010,"Vivek Kushwaha","vivek@gmail.com","IT",56000),
                new Employee(1110,"Ramesh Kumar","Ramesh@gmail.com","HR",46000)
        );

        //Find the size of employee
        int size = employeeList.size();
        System.out.println("Employee size: "+size);

        //print the Employee name in upper case
        List<String>upperCaseNames=employeeList.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .toList();

        System.out.println(upperCaseNames);


    }


}
