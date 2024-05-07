package com.example.demo.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringtoInteger {

    public static void main(String[] args) {
        String number = "ss42hol";

        System.out.println(myAtoi(number));
    }

    public static int myAtoi(String s) {
        Matcher matcher = Pattern.compile("([a-zA-Z ]+)?([\\+|\\-]?[\\d]+)([a-zA-Z ]+)?").matcher(s);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(2));
        }
        return 0;
    }

}
