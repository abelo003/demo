package com.example.demo.test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SalaryTest {

    public static void main(String[] args) {
        List<Employee> list = Stream.of(
        new Employee(1, "Abel", 33, "DEVOPS", 1500.0, Arrays.asList("hol@hotmail.com", "mundo@hotmail.com")),
        new Employee(2, "Fany", 29, "QA", 2000.0, Arrays.asList("ella@hotmail.com", "she@hotmail.com")),
        new Employee(3, "KO", 33, "QA", 1500.0, Arrays.asList("hol@hotmail.com", "mundo@hotmail.com")),
        new Employee(4, "UIY", 33, "TEST", 3800.0, Arrays.asList("hol@hotmail.com", "mundo@hotmail.com")),
        new Employee(5, "TG", 29, "QA", 2200.0, Arrays.asList("ella@hotmail.com", "she@hotmail.com")),
        new Employee(6, "OI", 29, "TEST", 2900.0, Arrays.asList("ella@hotmail.com", "she@hotmail.com"))
        ).collect(Collectors.toList());



        //aproach 1
        Map<String, Optional<Employee>> collect = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                        )
                );
        System.out.println(collect);
        //aproach 2
        Map<String, Employee> collect2 = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)
                        )
                );
        System.out.println(collect2);

        Map<String, List<Employee>> collect1 = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment
                        )
                );
        System.out.println(collect1);

        System.out.println("STREAM VS PARALLEL STREAM");
        IntStream.range(1, 10).forEach(t -> System.out.println(Thread.currentThread().getName() + ": " + t));
        System.out.println("*********************************************************");
        IntStream.range(1, 10).parallel().forEach(t -> System.out.println(Thread.currentThread().getName() + ": " + t));
    }

}
