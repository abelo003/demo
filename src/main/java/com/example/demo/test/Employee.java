package com.example.demo.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private List<String> emails;
}
