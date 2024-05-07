package com.example.demo.java8qa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,60,1,40,22,50,3,6);

        Predicate<Integer> predicate = (t) -> t > 6;

        list.stream()
                .filter(predicate)
                .sorted()
                .forEach(MethodReference::printElementStatic);

        MethodReference mr = new MethodReference();
        list.stream()
                .filter(predicate)
                .sorted()
                .forEach(mr::printElementInstance);
    }

    public void printElementInstance(Integer string) {
        System.out.println(string);
    }
    public static void printElementStatic(Integer string) {
        System.out.println(string);
    }

}
