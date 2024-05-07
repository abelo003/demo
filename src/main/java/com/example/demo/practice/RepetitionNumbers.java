package com.example.demo.practice;

import ch.qos.logback.core.read.ListAppender;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepetitionNumbers {

    public static void main(String[] args) {
        //3
        System.out.println(getFisrtDuplicated(new int[] {2, 3, 5, 3, 2}));
        //-1
        //System.out.println(getFisrtDuplicated(new int [] {1, 2, 3}));
        //5
        //System.out.println(getFisrtDuplicated(new int [] {5, 1, 2, 3, 5}));
        System.out.println(getFisrtDuplicated2A(new Integer[] {2, 3, 5, 3, 2}));
    }

    public static int getFisrtDuplicated(int [] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if( ! set.contains(num)){
                set.add(num);
            } else {
                return num;
            }
        }
        return -1;
    }

    public static int getFisrtDuplicated2A(Integer [] nums) {
        System.out.println("**************************");
        List<Integer> collect = Arrays.stream(nums)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(es -> es.getValue() >= 2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        if(collect.size() > 0) {
            return collect.get(0);
        }
        return -1;
    }

}
