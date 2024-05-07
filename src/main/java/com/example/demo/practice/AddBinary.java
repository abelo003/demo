package com.example.demo.practice;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(Long.toBinaryString(Long.parseLong(a, 2)  + Long.parseLong(b, 2)));
    }

}
