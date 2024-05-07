package com.example.demo.practice;

/**
 * @author Abel Cruz
 */
public class Palindrome {

    public static void main(String[] args) {
        String text = "::Anita Lava La Tina.,;:";
        text = text.replaceAll("[ \\.\\,\\;\\:]", "").trim().toLowerCase();
        System.out.println(text);
        boolean isPalindrome = true;
        for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
            if(text.charAt(i) != text.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("The text "+ ((isPalindrome) ? "IS": "IS NOT") +" palindrome.");
        //Solution 2
        System.out.println("The text " + (text.equals(new StringBuilder(text).reverse().toString()) ? "IS": "IS NOT") + " palindrome.");
    }

}
