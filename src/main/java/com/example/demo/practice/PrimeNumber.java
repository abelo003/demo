package com.example.demo.practice;

/**
 * @author Abel Cruz
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 8;
        //Solution
        System.out.println("The number " + number + (isPrime(number) ? " IS": " IS NOT") + " prime.");
        //Print the first prime number minor than 1000
        for (int i = 0; i < 1000; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        if(number == 2) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
