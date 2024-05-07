package com.example.demo.practice;

/**
 * @author Abel Cruz
 */
public class Factorial {

    public static void main(String[] args) {
        int number = 4;
        if(number < 1) {
            return;
        }
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        System.out.println("Factorial for " + number + " is " + sum);
        //Solution 2
        System.out.println("Factorial for " + number + " is " + factorial(number));
    }

    public static long factorial(int number) {
        if(number == 2) {
            return 2;
        }
        return number * factorial(number - 1);
    }

}
