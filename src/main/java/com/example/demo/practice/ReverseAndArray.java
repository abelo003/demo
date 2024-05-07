package com.example.demo.practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAndArray {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,4,5,6,7,8,9,50};
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            Integer aux = array[j];
            array[j] = array[i];
            array[i] = aux;
        }
        Arrays.stream(array).forEach(System.out::println);
        //Java8 solution
        Collections.reverse(Arrays.asList(array));
        Arrays.stream(array).forEach(System.out::println);
    }

}
