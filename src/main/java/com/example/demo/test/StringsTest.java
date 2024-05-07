package com.example.demo.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsTest {

    public static void main(String[] args) {
        String string = "kjhfihslfjlsjdfsdf";
        Map<String, Long> collect = Arrays.stream(string.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        System.out.println(collect);
    }

}
