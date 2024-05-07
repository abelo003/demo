package com.example.demo.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return nums.length == 0 ? 0: 1;
        }
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                counter++;
            }
        }

        nums = Arrays.stream(nums)
                .distinct()
                .toArray();

        return counter;
    }

}
