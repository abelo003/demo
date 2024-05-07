package com.example.demo.coding;

public class Roman {

    public static void main(String[] args) {
        int num = 3999;
        /**
         * I	1
         * V	5
         * X	10
         * L	50
         * C	100
         * D	500
         * M	1000
         */

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String roman = thousands[num / 1000];
        num = num % 1000;
        roman += hundreds[num / 100];
        num = num % 100;
        roman += tens[num / 10];
        num = num % 10;
        roman += units[num / 1];
        System.out.println(roman);
    }

}
