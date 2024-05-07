package com.example.demo.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OneMore {

    /**
     * Given a 2 dimenansional Matrix 5x5, filled randomly with numbers from 1 to 100.
     *
     * Find:
     *
     * a) THe Smallest Number
     * b) The largest NUmber
     * c) The average
     * d) The most repeated number
     * @param args
     */

    public static void main(String[] args) {

        List< List<Integer> > matrix = fill();
        print(matrix);
        IntSummaryStatistics su = matrix.stream()
                .flatMap(ele -> {
                    return ele.stream();
                })
                .mapToInt(a -> a.intValue())
                .summaryStatistics();
        System.out.println(su);

        findModa(matrix);
    }

    public static List<List<Integer>> fill() {
        int size = 5;
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(new Random().nextInt(100));
            }
            matrix.add(list);
        }
        return matrix;
    }

    public static void print(List<List<Integer>> matrix) {
        matrix.stream()
                .forEach( ele -> {
                    ele.stream().forEach(v -> System.out.printf("%2d ", v));
                    System.out.println();
                });
    }

    public static Set<Integer> findDuplicateByGrouping(List<Integer> list) {

        return list.stream()
                .sorted()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
                .entrySet().stream()                 // Map -> Stream
                .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

    }

    public static void findModa(List<List<Integer>> matrix) {
        List<Integer> all = matrix.stream()
                .flatMap(ele -> ele.stream())
                .sorted()
                .collect(Collectors.toList());
        int num = all.get(0);
        int times = 1;
        int counter = 1;
        int counterNum = all.get(0);
        for (int i = 1; i < all.size(); i++) {
            if (counterNum == all.get(i)) {
                counter ++;
            } else {
                if (counter > times) {
                    times = counter;
                    num = all.get(i - 1);
                }
                counter = 1;
                counterNum = all.get(i);
            }
        }
        if (counter >= times) {
            num = all.get(all.size() - 1);
        }
        System.out.println("MODA " + num);


        Set<Integer> result = findDuplicateByGrouping(all);
        System.out.println(result);
    }
}
