package com.example.demo.java8qa;

public class ConsString {

    public static void main(String[] args) {
        String abc = "aaaaabbccccccccccccccccddddaaaabbeeeeeeee";
        int times = 1;
        int maxTimes = 1;
        char c = abc.charAt(0);
        char val = abc.charAt(0);
        for (int i = 1; i < abc.length(); i++) {
            if(val == abc.charAt(i)) {
                times ++;
            } else {
                if(times > maxTimes) {
                    maxTimes = times;
                    c = abc.charAt(i-1);
                }
                times = 1;
                val = abc.charAt(i);
            }
        }
        System.out.println(maxTimes + " ==>  " + c);
    }

}
