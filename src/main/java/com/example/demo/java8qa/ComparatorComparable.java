package com.example.demo.java8qa;

import java.util.*;

public class ComparatorComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Abel", "DEV", 6500));
        employees.add(new Employee(2, "Joshes", "DEV", 5500));
        employees.add(new Employee(8, "John", "QA", 8500));
        employees.add(new Employee(4, "Clarissa", "DEV", 8500));
        employees.add(new Employee(5, "Katherine", "QA", 10_000));

        Collections.sort(employees);
        System.out.println(employees);

        Collections.sort(employees, ((o1, o2) -> {
            if(o1.getId() == o2.getId()) {
                return 0;
            } else if (o1.getId() > o2.getId()){
                return 1;
            }
            return -1;
        }));
        System.out.println(employees);
        Collections.sort(employees, (Comparator.comparing(Employee::getName)));
        System.out.println(employees);
        Collections.sort(employees, (Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(employees);

        Map<String, String> map = new TreeMap<>();
        StringJoiner sj = new StringJoiner(",", "[","]");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);
    }
}
