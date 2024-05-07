package com.example.demo.coding;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class SecondChallenge {

    public static void main(String[] args) {

        int n = 100000;
        Long millis = System.currentTimeMillis();
        erastosthenes(n);
        System.out.println();
        System.out.println((System.currentTimeMillis() - millis));
        System.out.println();
        millis = System.currentTimeMillis();
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println((System.currentTimeMillis() - millis));
    }

    public static boolean isPrime(int number){
        int counter = 2;
        boolean prime = true;
        while ((prime) && (counter != number)){
            if (number % counter == 0) {
                prime = false;
                break;
            }
            counter ++;
        }
        return prime;
    }

    public static void erastosthenes(int size) {
        List<Integer> nums = new LinkedList<>();
        IntStream.range(2, size + 1).forEach(nums::add);

        for (int i = 0; i < nums.size(); i++) {
            nums = clean(nums, nums.get(i));
        }
        nums.stream().forEach(v -> {
            System.out.print(v + ", ");
        });
    }

    public static List<Integer> clean(List<Integer> nums, int prime) {
        for (int i = nums.indexOf(prime); i < nums.size(); i++) {
            if (nums.get(i) % prime == 0 && nums.get(i) != prime) {
                nums.remove(i);
            }
        }
        return nums;
    }

}
