package com.example.demo.java8qa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSalary {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Abel", "DEV", 6500));
        employees.add(new Employee(2, "Joshep", "DEV", 5500));
        employees.add(new Employee(3, "John", "QA", 8500));
        employees.add(new Employee(4, "Clarissa", "DEV", 8500));
        employees.add(new Employee(5, "Katherine", "QA", 10_000));

        System.out.println(employees);
        employees.stream()
                //.filter(e -> e.getDept().equalsIgnoreCase("DEV"))
                .map(e -> {
                    if(e.getDept().equalsIgnoreCase("DEV")) {
                        e.setSalary(e.getSalary() * 1.1);
                    }
                    return e;
                }).collect(Collectors.toList());
        System.out.println(employees);
        //System.out.println(employees1);
    }

}
