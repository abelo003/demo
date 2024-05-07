package com.example.demo.practice;

public class _PigLatin {

    public static void main(String[] args) {
        String text = "ibanana";
        int size = 1;
        int position = 0;
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if(String.valueOf(text.charAt(i)).matches("B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z|b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z")) {
                found = true;
                position = i;
                for (int j = i + 1; j < text.length(); j++) {
                    if(String.valueOf(text.charAt(j)).matches("B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z|b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z")) {
                        size ++;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        if(found) {
            if(position == 0) {
                text = text.substring(position + size).concat(text.substring(0, position + size).concat("ay"));
            } else {
                System.out.println(text.substring(0, position));
                System.out.println(text.substring(position + size));
                text = text.substring(0, position).concat(text.substring(position + size).concat(text.substring(position, position + size)).concat("ay"));
            }
            System.out.println("Pig Latin: " + text);
        }
    }

}
