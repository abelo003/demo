package com.example.demo.java8qa;

import java.util.stream.IntStream;

public class StreamVsParallelStream {

    public static void main(String[] args) {
        //Stream
        IntStream.rangeClosed(1, 10)
                .forEach(t->System.out.println(Thread.currentThread().getName() + " " + t));
        //Parallel Stream
        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(t->System.out.println(Thread.currentThread().getName() + " " + t));
    }

}
