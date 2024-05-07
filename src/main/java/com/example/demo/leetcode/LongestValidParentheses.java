package com.example.demo.leetcode;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = "(";

        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
        }
        return open > close ? open: close;
    }

}
