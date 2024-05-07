package com.example.demo.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodingT {

    public static void main(String[] args) {
        //find the duplicate Character in above String
        String str="iamlearningjava";
        str = str.toLowerCase();
        System.out.println("Java 8");
        Stream.of(str.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                )
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .forEach(c -> {
                    System.out.println(c);
                });

        System.out.println("Java 7");
        Map<String, Integer> d = new HashMap<>();
        for (char c: str.toCharArray()) {
            d.put(c+"", d.getOrDefault(c + "", 0) + 1);
        }
        d.entrySet().stream().forEach(r -> {
            if(r.getValue() > 1) {
                System.out.println(r);
            }
        });

        //find out minimum and maximum integer from array
        int arr[] = {0,3,5,8,9,1};
        IntSummaryStatistics summary = IntStream.of(arr).summaryStatistics();
        System.out.println("Java 8");
        System.out.println("min: " + summary.getMin());
        System.out.println("max: " + summary.getMax());

        List<Integer> list = new ArrayList<>();
        for (Integer num: arr) {
            list.add(num);
        }
        System.out.println("Java 7");
        Collections.sort(list);
        System.out.println("min: " + list.get(0));
        System.out.println("max: " + list.get(list.size() - 1));
    }

}
