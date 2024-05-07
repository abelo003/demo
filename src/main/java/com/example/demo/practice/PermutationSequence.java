package com.example.demo.practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermutationSequence {
    static int counter = 0;
    public static void main(String[] args) {
        int n = 3;
        int num = 3;
        int perm[] = new int[n];
        IntStream.rangeClosed(1, n).forEach(e -> perm[e - 1] = e);
        counter = 1;
        do {

            if(counter == num) {
                System.out.println(Arrays.stream(perm).mapToObj(Integer::toString).collect(Collectors.joining("")));

                break;
            }
        } while (nextPermutation(perm));
    }

    private static boolean nextPermutation(int[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        counter++;
        return true;
    }
}
