package com.example.demo.coding;

public class TodayCodeCallendge {

/*
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:
Input: s = "1 + 1"Output: 2
Example 2:
Input: s = " 2-1 + 2 "Output: 3
Example 3:
Input: s = "(1+(4+5+2)-3)+(6+8)"Output: 23

Constraints:
1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
*/

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        //String s = "1 + 1";
        //String s = " 2-1 + 2 ";
        //String s = "1";
        if((s.length() < 1 || s.length() > 3 * 105) || ! s.matches("[ \\+\\-\\(\\)\\d]+")) {
            System.out.println("Constraints violation.");
            return;
        }
        s = s.trim().replaceAll(" |\\(|\\)", "");
        int result = getNumber(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-') {
                int nextNumber = getNumber(s.substring(i + 1));
                switch (s.charAt(i)) {
                    case '+': result+=nextNumber;
                    break;
                    case '-': result-=nextNumber;
                }
            }
        }
        System.out.println("Output: " + result);
    }

    public static int getNumber(String s) {
        int startFirst = 0;
        int fisrtSize = getSize(s);
        String fisrtPart = s.substring(0, startFirst + fisrtSize);
        return Integer.valueOf(s.substring(startFirst, startFirst + fisrtSize));
    }

    public static int getSize(String s) {
        int i = 0;
        for (; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57 ) {
                continue;
            } else {
                return i;
            }
        }
        return i;
    }

}
