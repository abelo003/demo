package com.example.demo.leetcode;

import java.util.regex.PatternSyntaxException;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        String p = "a***abc";
        String s = "ab";
        try {
            System.out.println(s.matches(p));
        } catch (PatternSyntaxException e) {
            System.out.println(false);;
        }
    }

}
