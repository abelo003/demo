package com.example.demo.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidNUmber {

    public static void main(String[] args) {
        /*String validNumbers [] = new String[]{"2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"};
        for (String num: validNumbers) {
            System.out.println(isNumber(num) + " = " + num);
        }
        System.out.println("********************");
        String invalidNumbers [] = new String[]{"abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"};
        for (String num: invalidNumbers) {
            System.out.println(isNumber(num) + " = " + num);
        }*/
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map.put(1, 1 + map.getOrDefault(1, 1)));
        System.out.println(map.put(1, 1 + map.getOrDefault(1, 1)));
        System.out.println(map);
    }

    public static boolean isNumber(String s) {
        return s.matches("([-+]?[0-9]+[.]?[0-9]+?)|([+-]?[0-9]\\.?[0-9]++[e|E][-+]?[0-9]+)");
    }

}
