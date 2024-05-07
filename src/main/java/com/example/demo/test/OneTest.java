package com.example.demo.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class OneTest {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, "hello");
        map = new ConcurrentHashMap<>();
        //map.put(null, null);

        Employee e1 = new Employee(1, "Abel", 33, "", 1.0, Arrays.asList("hol@hotmail.com", "mundo@hotmail.com"));
        Employee e2 = new Employee(2, "Fany", 29, "", 2.0, Arrays.asList("ella@hotmail.com", "she@hotmail.com"));


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        list.stream()
                .map(Employee::getAge)
                .forEach(System.out::println);
        list.stream()
                .flatMap(e -> e.getEmails().stream())
                .forEach(System.out::println);

    }

}
