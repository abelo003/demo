package com.example.demo.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Abel Cruz
 */
public class FibonacciSerie {

    public static void main(String[] args) {
        int total = 15;
        int array [] = new int[total];
        for (int i = 0; i < total; i++) {
            if(i == 0) {
                array[i] = 1;
                System.out.print(array[i] + " ");
            } else if(i == 1) {
                array[i] = 1;
                System.out.print(array[i] + " ");
            } else {
                array[i] = array[i - 1] + array[i - 2];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.stream(array).mapToObj(n->String.valueOf(n)).collect(Collectors.toList()));
        //Second approach
        System.out.println();
        int prev = 0;
        int prevSecond = 0;
        int current = 0;
        for (int i = 0; i < total; i++) {
            if(i == 0) {
                prevSecond = 1;
                System.out.print(prevSecond + " ");
            } else if(i == 1) {
                prev = 1;
                System.out.print(prev + " ");
            } else {
                current = prevSecond + prev;
                System.out.print(current + " ");
                prevSecond = prev;
                prev = current;
            }
        }
    }

}
