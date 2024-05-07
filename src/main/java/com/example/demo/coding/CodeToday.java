package com.example.demo.coding;

public class CodeToday {
    public static void main(String[] args) {
        //[1,2,3]
        //[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        String text = "123";

        print(text);
    }

    public static void print(String text ){
        for (int i = 0; i < text.length(); i++) {
            text = printSerie(text);
        }
    }

    public static String changeOrder(String text) {
        return text.substring(1) + text.charAt(0);
    }

    public static String printSerie(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                System.out.print(text.charAt(j));
            }
            text = changeOrder(text);
            System.out.println();
        }
        System.out.println("Final combination ... " + text);

        System.out.println("New combination to process " + text);
        return text;
    }
}
