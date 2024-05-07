package com.example.demo.coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeTextJadeSmith {

    public static void main(String[] args) {
        String text = "How can mirrors be real if our eyes aren't real";
        String collect = Arrays.stream(text.split(" "))
                .map(string -> Character.toUpperCase(string.charAt(0)) + string.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println("Expected: ");
        System.out.println("How Can Mirrors Be Real If Our Eyes Aren't Real");
        System.out.println("Result: ");
        System.out.println(collect);
    }

}
