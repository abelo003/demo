package com.example.demo.codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductSum {

    public static void main(String[] args) {
        System.out.println(solution(123456));
    }

    public static int solution(int n) {
        List<Integer> result = new ArrayList<>(n);
        int sum = 0;
        int prod = 1;
        for (String s : String.valueOf(n).split("")) {
            sum += Integer.valueOf(s);
            prod *= Integer.valueOf(s);
        }
        return prod - sum;
    }

}
