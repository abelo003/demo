package com.example.demo.practice;

import java.util.Arrays;

/**
 * @author Abel Cruz
 */
public class CheckAnagrams {

    public static void main(String[] args) {
        String string1 = "hola Mundo.:";
        String string2 = "mundo HoLA.";

        string1 = string1.replaceAll("[ \\.\\,\\;\\:]", "").toLowerCase();
        string2 = string2.replaceAll("[ \\.\\,\\;\\:]", "").toLowerCase();

        if(orderLetters(string1).equals(orderLetters(string2))) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NO ANAGRAM");
        }

        //Other solution
        char[] orders1 = string1.toCharArray();
        char[] orders2 = string2.toCharArray();
        Arrays.sort(orders1);
        Arrays.sort(orders2);
        if(new String(orders1).equals(new String(orders2))) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NO ANAGRAM");
        }
    }

    public static String orderLetters(String text) {
        char [] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    char aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return new String(array);
    }

}
