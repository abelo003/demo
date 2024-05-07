package com.example.demo.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
        System.out.println("Result: ");
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if(nums[i] <= target) {
                if(target == nums[i]) {
                    return i;
                }
            } else {
                return i;
            }
        }
        return i;
    }

}
