package com.example.demo.practice;

import java.util.Arrays;

/**
 * @author Abel Cruz
 */
public class MaximumNumber {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,467,5,6,7,8,9,50};

        Integer max = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum number is " + max);
        //Other solution
        System.out.println("The maximum number is " + Arrays.stream(array).mapToInt(n->n).max().getAsInt());
    }

}
