package com.example.demo.coding;

public class Coding1202 {

    public static void main(String[] args) {
        //https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
        /**
         * [15:37] Ram (Guest)
         * Array min number
         * [15:37] Ram (Guest)
         * Array Max Number
         * [15:37] Ram (Guest)
         * String repeated Chars
         * [15:38] Ram (Guest)
         * String Non-Repeat chars
         * [15:38] Ram (Guest)
         * String first repeated char
         * [15:38] Ram (Guest)
         * String first non repeat char
         * [15:39] Ram (Guest)
         * remove duplicate in array
         * [15:39] Ram (Guest)
         * Java 8
         */

        //[2,3,1,1,4]
        int array[] = new int[]{2,3,1,1,4};
        //System.out.println("RESULT: " + (find(array) ? "true": "false"));
        array = new int[]{3,2,1,0,4};
        //System.out.println("RESULT: " + (find(array) ? "true": "false"));
        array = new int[]{3,1,1,1,1};
        //System.out.println("RESULT: " + (find(array) ? "true": "false"));
        array = new int[]{2,0};
        array = new int[]{2,0,0};
        System.out.println("RESULT: " + (find(array) ? "true": "false"));

    }

    public static boolean find(int nums[]) {
        if (nums.length == 1) {
            return nums[0] == 0 || nums[0] == 1;
        }
        int jump = nums[0];
        if (jump >= nums.length - 1) {
            return true;
        }
        for (; jump < nums.length;) {
            if (nums[jump] == 0) {
                boolean zeros = true;
                for (int i = nums[jump]; i < nums.length; i++) {
                    if(nums[jump] != 0) {
                        zeros = false;
                        break;
                    }
                }
                return zeros;
            } else {
                jump += nums[jump];
                if (jump >= nums.length - 1) {
                    return true;
                }
            }
        }
        return jump >= nums.length;
    }

}
