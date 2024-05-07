package com.example.demo.practice;

import java.util.Arrays;

/**
 * @author Abel Cruz
 */
public class SortingArray {

    public static void main(String[] args) {
        Integer[] original = new Integer[]{999,24,2,11,876,0,3,-1};
        //Selection sort
        Integer[] array = original.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = i ; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        System.out.println("Selection sort");
        Arrays.stream(array).forEach(el->System.out.print(el+" "));
        //Bubble sort
        Integer[] array2 = original.clone();
        for (int i = array2.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(array2[j] > array2[j + 1]) {
                    int aux = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = aux;
                }
            }
        }
        System.out.println("\nBubble sort");
        Arrays.stream(array2).forEach(el->System.out.print(el+" "));
    }

}
