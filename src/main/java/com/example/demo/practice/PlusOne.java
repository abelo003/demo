package com.example.demo.practice;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = plusOne(new int[]{9,9,9});
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + ",");
        }
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        else{
            boolean next = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if(next) {
                    if(digits[i] < 9) {
                        digits[i] = digits[i] + 1;
                        next = false;
                        break;
                    } else {
                        digits[i] = 0;
                    }
                }
                else if (digits[i] == 9) {
                    next = true;
                    digits[i] = 0;
                }
            }
            if(next) {
                int newDigits [] = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int i = 1; i < newDigits.length; i++) {
                    newDigits[i] = digits[i-1];
                }
                digits = newDigits;
            }
        }
        return digits;
    }

}
