package com.example.demo.leetcode;

public class IntegertoRoman {

    public static void main(String[] args) {
        /**
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        return new StringBuilder().append(getThousands(num/1000)).append(getHundreds((num%=1000)/100)).append(getTens((num%=100)/10)).append(getUnits(num%10)).toString();
    }

    public static String getUnits(int number) {
        switch (number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
        }
        return "";
    }

    public static String getTens(int number) {
        switch (number) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
        }
        return "";
    }

    public static String getHundreds(int number) {
        switch (number) {
            case 1: return "C";
            case 2: return "CC";
            case 3: return "CCC";
            case 4: return "CD";
            case 5: return "D";
            case 6: return "DC";
            case 7: return "DCC";
            case 8: return "DCCC";
            case 9: return "CM";
        }
        return "";
    }

    public static String getThousands(int number) {
        switch (number) {
            case 1: return "M";
            case 2: return "MM";
            case 3: return "MMM";
        }
        return "";
    }

}
