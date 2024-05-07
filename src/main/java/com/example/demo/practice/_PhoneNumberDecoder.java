package com.example.demo.practice;

import java.util.Arrays;

public class _PhoneNumberDecoder {

    public static void main(String[] args) {
        String number = "800888TEST";
        number = number.trim().toUpperCase();
        char[] arr = number.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((int)arr[i]);
            if(arr[i] > 57) {
                arr[i] = letterToNumber(arr[i]);
            }
        }
        number = new String(arr);
        number = "(".concat(number.substring(0,3).concat(") ")).concat(number.substring(3, 6)).concat("-").concat(number.substring(6));
        System.out.println(number);
        System.out.println("(800) 888-8378");
    }

    public static char letterToNumber(char c) {
        //2(A,B,C) 3(D,E,F) 4(G,H,I) 5(J,K,L) 6(M,N,0) 7(P,Q,R,S) 8(T,U,V) 9(W,X,Y,Z)
        if(String.valueOf(c).matches("A|B|C")) {
            return '2';
        } else if(String.valueOf(c).matches("D|E|F")) {
            return '3';
        } else if(String.valueOf(c).matches("G|H|I")) {
            return '4';
        } else if(String.valueOf(c).matches("J|K|L")) {
            return '5';
        } else if(String.valueOf(c).matches("M|N|O")) {
            return '6';
        } else if(String.valueOf(c).matches("P|Q|R|S")) {
            return '7';
        } else if(String.valueOf(c).matches("T|U|V")) {
            return '8';
        } else if(String.valueOf(c).matches("W|X|Y|Z")) {
            return '9';
        }
        return '0';
    }

}
