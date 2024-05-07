package com.example.demo.exercism;

import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeString {

    public static void main(String[] args) {
        //First one
        System.out.println("\nFirst problem *****************************\n");
        String name="ram";
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));

        System.out.println("\nSecond problem *****************************\n");
        //Second one
        /*
        C
        C#
        C++
        Java
        HTML
        COBOL
        Python
        Kotlin
        */

        String array[] = {"Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C"};

        List<String> sortedElements = Arrays.asList(array).stream()
                .sorted(Comparator.comparing(a->a.length()))
                .collect(Collectors.toList());

        System.out.println(sortedElements);

        /*Arrays.stream(array)
                .sorted(Comparator.comparing(l -> l.length()))
                .forEach(System.out::println);*/

        System.out.println("\nThird problem *****************************\n");
        //Third one
        String str = "Java Concept Of The Day";
        String sections[] = str.split(" ");
        for (int i = 0; i < sections.length; i++) {
            for (int j = sections[i].length() - 1; j > -1; j--) {
                System.out.print(sections[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println("\n\nJava 8 approach.\n");
        /*String reverse = Arrays.stream(Arrays.stream(str.split(" "))
                .map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));*/
        String reverse = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);

    }

}