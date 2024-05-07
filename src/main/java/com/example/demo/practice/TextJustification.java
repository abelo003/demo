package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class TextJustification {

    public static void main(String[] args) {
        //String words [] = new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        //String words [] = new String[]{"What","must","be","shall","be."};
        //String words [] = new String[]{"Listen","to","many,","speak","to","a","few."};
        String words [] = new String[]{"Give","me","my","Romeo;","and,","when","he","shall","die,","Take","him","and","cut","him","out","in","little","stars,","And","he","will","make","the","face","of","heaven","so","fine","That","all","the","world","will","be","in","love","with","night","And","pay","no","worship","to","the","garish","sun."};
        int maxWidth = 25;

        List<String> result = new ArrayList<>();
        String sj = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == maxWidth) {
                if(i != 0 && sj.length() > 0) {
                    System.out.println(rowJustification(sj, maxWidth, false));
                    //result.add(rowJustification(sj, maxWidth, false));
                }
                System.out.println(rowJustification(words[i], maxWidth, false));
                //result.add(rowJustification(words[i], maxWidth, false));
                sj="";
            }
            else if(  sj.concat(words[i]).length() + 1 <= maxWidth) {
                sj += ((sj.length() == 0)? "" : " ").concat(words[i]);
            } else {
                System.out.println(rowJustification(sj, maxWidth, false));
                //result.add(rowJustification(sj, maxWidth, false));
                //System.out.println("*********************************");
                //System.out.println("complete line: " + sj);
                sj = words[i];
            }
        }
        if(sj.length() > 0) {
            //System.out.println("complete line: " + sj);
            System.out.println(rowJustification(sj, maxWidth, true));
            //result.add(rowJustification(sj, maxWidth, true));
        }
    }

    public static String rowJustification(String sj, int maxWidth, boolean lastRow) {
        String [] split = sj.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            split[i]+=" ";
        }
        StringBuilder result = new StringBuilder();
        int words = split.length;
        int left = maxWidth - sj.length();
        if(words == 1) {
            return split[0].concat(getWitheSpaces(maxWidth - split[0].length()));
        } else if(words == 2) {
            if(lastRow) {
                return split[0].concat(split[1]).concat(getWitheSpaces(left));
            } else{
                return split[0].concat(getWitheSpaces(left)).concat(split[1]);
            }
        }
        if(lastRow) {
            return sj.concat(getWitheSpaces(left));
        }
        int each = (left / (words - 1)) + ((left % (words - 1) != 0) ? 1: 0);
   /*     System.out.println("*************");
        System.out.println(sj);
        System.out.println("words: " + words);
        System.out.println("length: " + sj.length());
        System.out.println("left: " + left);
        System.out.println("each: " + each);

*/
        for (int i = 0; i < words; i++) {
            //System.out.println("New word: [" + split[i].concat(getWitheSpaces(each))+ "]");
            //System.out.println("word postion " + i);
            if(each * (i + 1) <= left) {
                //System.out.println("Adding...");
                result.append(split[i].concat(getWitheSpaces(each)));
            } else {
                if((each * (i + 1) ) - left < each) {
                   // System.out.println("YES: " + split[i] + " ==> left: " + (left - (each * i) ));
                    result.append(split[i].concat(getWitheSpaces((left - (each * i) ))));
                } else {
                    //System.out.println("NOP: " + each * i + " : " + left);
                    result.append(split[i]);
                }
            }
        }
        return result.toString();
    }

    public static String getWitheSpaces(int each) {
        String str = "";
        for (int i = 0; i < each; i++) {
            str+=" ";
        }
        return str;
    }

}
