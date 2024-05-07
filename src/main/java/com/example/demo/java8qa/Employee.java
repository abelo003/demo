package com.example.demo.java8qa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String dept;
    private double salary;

    @Override
    public int compareTo(Employee o) {
        if(getId() == o.getId()) {
            return 0;
        } else if (getId() > o.getId()){
            return 1;
        }
        return -1;
    }
}
