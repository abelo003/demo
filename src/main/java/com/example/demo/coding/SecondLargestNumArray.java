package com.example.demo.coding;

import java.util.Arrays;

public class SecondLargestNumArray {

    public static void main(String[] args) {
        /**
         * Write a program to find the second largest number in an array in Java
         */
        int array [] = {1,78,100,77,300};
        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }

}
