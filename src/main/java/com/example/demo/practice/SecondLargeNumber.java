package com.example.demo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abel Cruz
 */
public class SecondLargeNumber {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{100,2,3,4,5,6,8,7,8,9,50,51,90};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        System.out.println("Second largest number: " + array[array.length - 2]);
        //Second approach
        List<Integer> result = Arrays.asList(array).stream().sorted().collect(Collectors.toList());
        System.out.println("Ordered array " + result);
        System.out.println("Second largest number: " + result.get(result.size() - 2));
    }

}
