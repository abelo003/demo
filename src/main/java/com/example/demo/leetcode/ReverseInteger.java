package com.example.demo.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public static long reverse(int x) {
        try {
            return (x < 0 ? -1 : 1) * Integer.parseInt(new StringBuilder().append(Math.abs(x)).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
