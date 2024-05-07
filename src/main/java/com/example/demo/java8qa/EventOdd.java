package com.example.demo.java8qa;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EventOdd implements Cloneable{

    private static Object obj = new Object();
    private static IntPredicate evenCondition = e -> e%2 == 0;
    private static IntPredicate oddCondition = e -> e%2 != 0;

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        //CompletableFuture.runAsync(() -> EventOdd.printNumber(oddCondition));
        //CompletableFuture.runAsync(() -> EventOdd.printNumber(evenCondition));

        //Thread.sleep(1000);
        EventOdd e1 = new EventOdd();
        System.out.println(e1);
        System.out.println(e1.clone());
    }

    public static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1, 10).filter(condition).forEach(EventOdd::execute);
    }

    public static void execute(int no) {
        synchronized (obj) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + no);
                obj.notify();
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
