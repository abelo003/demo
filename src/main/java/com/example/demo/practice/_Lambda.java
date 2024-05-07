package com.example.demo.practice;

import java.util.function.Predicate;

public class _Lambda {

    public static void main(String[] args) {
        //odd
        Integer number = 17;
        Predicate<Integer> oddEven = o -> o / 2 == 0;
        System.out.println( number + " " + (oddEven.test(number) ? "Even": "Odd"));
        //prime
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(number + " " + (isPrime.test(number) ? "Is prime": "Is NOT prime"));
        //palindrome
        String text = "anita lava la tina";
        Predicate<String> palindrome = t -> {
            t = t.trim().replaceAll("[ \\,\\.\\;\\:]", "").toLowerCase();
            return (t.equalsIgnoreCase(new StringBuilder(t).reverse().toString()));
        };
        System.out.println(text + " --> " + (palindrome.test(text) ? "Is palindrome.": "Is NOT palindrome.") );
    }

}
