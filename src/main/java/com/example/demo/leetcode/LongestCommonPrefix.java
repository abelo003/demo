package com.example.demo.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] strs = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int pos = 0;
        boolean fit = true;
        while (fit){
            char current = ' ';
            if(pos < strs[0].length() && strs[0].length() != 0) {
                current = strs[0].charAt(pos);
            } else {
                break;
            }
            for (int i = 1; i < strs.length; i++) {
                if (pos >= strs[i].length() || strs[i].charAt(pos) != current) {
                    fit = false;
                    pos--;
                    break;
                }
            }
            pos++;
        }
        if(pos <= 0) {
            return "";
        }
        return strs[0].substring(0, pos);
    }

}
