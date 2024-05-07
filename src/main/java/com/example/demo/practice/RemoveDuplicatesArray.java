package com.example.demo.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abel Cruz
 */
public class RemoveDuplicatesArray {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,3,4,5,6,8,7,7,8,9,50,51,51,90};
        System.out.println("Original size: " + array.length);
        HashSet set = new HashSet(Arrays.asList(array));
        System.out.println("Clean array size " + set.size() + " elements: " + set);
        //Other Solution
        List<Integer> result = Arrays.asList(array).stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Clean array size " + result.size() + " elements: " + result);
    }

}
