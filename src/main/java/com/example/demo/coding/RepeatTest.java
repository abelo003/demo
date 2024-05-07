package com.example.demo.coding;

public class RepeatTest {

    public static void main(String[] args) {
        String str1 = new String("11112sssss2233");
        char ch = ' ';
        int size = 1;
        int maxF = 1;
        int chF = ' ';
        int pos = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(ch == str1.charAt(i)) {
                size ++;
            } else{
                if (size > maxF) {
                    maxF = size;
                    chF = ch;
                    pos = i - size;
                }
                size = 1;
                ch = str1.charAt(i);
            }
        }
        if(size > maxF) {
            maxF = size;
            chF = ch;
            pos = str1.length() - size;
        }
        System.out.println("Position " + pos);
        System.out.println(maxF);
        System.out.println((char)chF);
        System.out.println(str1.substring(pos, pos + maxF));
    }

}
