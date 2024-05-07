package com.example.demo.java8qa;

public class Test {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        };

        Runnable r = () -> System.out.println("Hi");

        r.run();

    }

}
