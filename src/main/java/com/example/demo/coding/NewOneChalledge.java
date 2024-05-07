package com.example.demo.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class NewOneChalledge {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{0,1,2,3,4,6,7,8,9};
        List<Integer> numbers = Arrays.asList(array);
        Collections.sort(numbers);
        StringBuilder missing = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < numbers.size(); i++, pos++) {
            if( pos < numbers.size() && ! numbers.get(pos).equals(i)) {
                missing.append(String.valueOf(i));
                pos--;
            }
        }
        System.out.println("Missing number: " + missing);
        //**************************************************************
        missing = new StringBuilder();
        pos = 0;
        for (int i = 0; i < array.length; i++, pos++) {
            if( pos < array.length && ! array[pos].equals(i)) {
                missing.append(String.valueOf(i));
                pos--;
            }
        }
        System.out.println("Missing number: " + missing);
        solutionByMonil(array);
    }

    public static void solutionByMonil(Integer[] array) {
        int result = Arrays.asList(array).stream().mapToInt(Integer::valueOf).sum();
        int expected = IntStream.range(0,array.length + 1).sum();
        System.out.println("Missing number: " + (expected - result));
    }

}
