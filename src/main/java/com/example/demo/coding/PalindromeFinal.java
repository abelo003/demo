package com.example.demo.coding;

import java.util.Arrays;
import java.util.List;

public class PalindromeFinal {

    public static int errors = 0;

    public static void main(String[] args) {
        List<String> cases = Arrays.asList(
                "PDABALEARROZALAZORRAELABADGH"
                /*"XDABALEARROZXALAZORRAELABAYD",
                "DYABALEARROZALAXZORRAELABADX",
                "DDDDABALEARROZALAZORRAELABAD",
                "DABALEARROZALAZORRAELABADDDD",
                "ANITA LAVA LA TInA",
                "ANITALAVALATINA",
                "OJO",
                "J",
                "JJXJ",
                "AXYZNA",
                "ZORRAARROZ",
                "ZXORRAARROZ",
                "ZXOXRRAARROZ",
                "ZXXOXRRAARROZ",
                "ZXXOXRXRAARROZ",
                "DABALEARROZALAZORRAELABAD",
                "XDABALEARROZXALAZORRAELABAYD",
                "XZORRYAARROZP",
                "DDDDABALEARROZALAZORRAELABAD",
                "DABALEARROZALAZORRAELABADXX"*/);
        for (String text: cases) {
            text = text.replace(" ", "").toUpperCase();
            errors = 0;
            reduceText(text);
            if (errors == 0) {
                System.out.println(text + " IS PALINDOME");
            } else if (errors < 4) {
                System.out.println(String.format("%s IS PALINDROME WITH %s MISSMATCH WORDS", text, errors));
            } else {
                System.out.println(text + " IS NOT PALINDROME ");
            }
        }
    }

    public static String reduceText (String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                return reduceText(text.substring(i + 1, text.length() - 1));
            } else {
                int j = 0;
                for (; j < text.length() / 2; j++) {
                    if (text.charAt(i) == text.charAt(text.length() - 1 - j)) {
                        //Check for missmatch world
                        String reverse = new StringBuilder(text).reverse().toString();
                        int k = 0;
                        for (; k < reverse.length() / 2; k++) {
                            if (reverse.charAt(0) == reverse.charAt(reverse.length() - 1 - k)) {
                                errors ++;
                                return reduceText(reverse.substring(1));
                            }
                        }
                        if (k == reverse.length() / 2) {
                            errors ++;
                            return reduceText(reverse.substring(1));
                        }
                        break;
                    }
                }
                if (j == text.length() / 2) {
                    //letter not found
                    errors ++;
                    return reduceText(text.substring(1));
                }
            }
        }
        return "";
    }

}
