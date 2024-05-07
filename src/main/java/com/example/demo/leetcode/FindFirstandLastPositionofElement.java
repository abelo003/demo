package com.example.demo.leetcode;

import java.util.Arrays;

public class FindFirstandLastPositionofElement {

    public static void main(String[] args) {
        /*int nums [] = {5,7,7,8,8,10};
        Arrays.stream(searchRange(nums, 6))
                .forEach(System.out::println);*/
        Arrays.stream(searchRange(new int[]{}, 0))
                .forEach(System.out::println);
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(start == -1) {
                    start = end = i;
                } else {
                    end = i;
                }
            }
        }
        return new int[] {start, end};
    }

}
