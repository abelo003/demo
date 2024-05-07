package com.example.demo.exercism;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

    static boolean isArmstrongNumber(int numberToCheck) {
        if(numberToCheck < 10) {
            return true;
        }
        String val = String.valueOf(numberToCheck);
        int len = val.length();
        long sum = 0;
        for (int i = 0; i < len; i++) {
            int ex = 1;
            for (int j = 0; j < len; j++) {
                ex *= (val.charAt(i) - 48);
            }
            sum += ex;
        }
        return sum == numberToCheck;
    }

}
