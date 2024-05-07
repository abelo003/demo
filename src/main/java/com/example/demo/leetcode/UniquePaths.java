package com.example.demo.leetcode;

import java.util.Arrays;

public class UniquePaths {

    public static void main(String args []) {
        int n = 4;
        int m = 4;

        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[j] += f[j - 1];
            }
        }
        Arrays.stream(f).forEach(System.out::println);
        System.out.println("*************");
        System.out.println(f[n - 1]);
    }

}
