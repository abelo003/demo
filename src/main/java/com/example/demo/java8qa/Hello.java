package com.example.demo.java8qa;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) {
        //Print the number of ocurrence of each character
        String string = "Basant";
        Map<String, Long> countMap = Arrays.stream(string.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        System.out.println(countMap);

        //Higher salary per department
        List<Employee> employees = Stream.of(
                new Employee(1, "Basant", "DEV", 50000),
                new Employee(8, "Santosh", "DEV", 80000),
                new Employee(3, "Pratik", "QA", 60000),
                new Employee(9, "Dipak", "QA", 90000),
                new Employee(4, "Bikash", "DEVOPS", 40000)
        ).collect(Collectors.toList());

        Comparator<Employee> comparatorBySalary = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> employeeMap = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(comparatorBySalary)))
                );
        System.out.println(employeeMap);
        //aproach 2
        Map<String, Employee> employeeMap1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)
                ));
        System.out.println(employeeMap1);
    }
}
