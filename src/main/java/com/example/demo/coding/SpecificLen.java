package com.example.demo.coding;

public class SpecificLen {
    public static String fixedLengthString(String string, int length) {
        return String.format("0%1$"+length+ "s", string);
    }

    public static void main(String[] args) {
        //System.out.println(fixedLengthString("1234", 8));
        System.out.println(String.format("%014d", Long.parseLong("0880609125435")));
        System.out.println(String.format("%014d", Long.parseLong("0880609146567")));
        System.out.println(String.format("%014d", Long.parseLong("0880609173047")));
        //System.out.println(Long.MAX_VALUE);
    }
}
