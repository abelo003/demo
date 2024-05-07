package com.example.demo.leetcode;

import java.util.StringJoiner;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        //int[] nums1 = new int[]{};
        //int[] nums2 = new int[]{1};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 || n == 0) {
            if (m == 0) {
                print(nums1);
            } else {
                print(nums2);
            }
            return;
        }
        int result [] = new int[nums1.length];
        for (int i = 0, j = 0, k = 0; i < nums1.length; i++) {
            if(nums1[j] <= nums2[k] && j < m) {
                result[i] = nums1[j];
                j++;
                continue;
            } else {
                int aux = nums1[j];
                result[i] = nums2[k];
                k++;
            }
        }
        print(result);
    }

    public static void print(int [] result) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int a: result) {
            sj.add(a+"");
        }
        System.out.println(sj);
    }

}
