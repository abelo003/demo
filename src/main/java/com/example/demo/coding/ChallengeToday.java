package com.example.demo.coding;

public class ChallengeToday {

    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) {
            int a = i;
            StringBuilder sb = new StringBuilder();
            //Part for left size
            for (int j = 1; j <= size; j++) {
                if(j <= i) {
                    sb.append(String.format("%2d", a));
                } else {
                    sb.insert(0, "  ");
                }
                a++;
            }
            a -= 2;
            //Part for rigth size
            for (int j = size; j > 1; j--) {
                if(i >= j) {
                    sb.append(String.format("%2d", a));
                }
                a--;
            }
            System.out.println(sb);
        }
    }
}
