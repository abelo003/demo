package com.example.demo.practice;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/home/hello//js///hello////";
        if (path.matches(".*[/]{2,}.*")) {
            System.out.println("Yes");
            path = path.replaceAll("[/]{2,}","/");
        }
        if(path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        if(path.contains("..")) {
            path = "/";
        }
        System.out.println(path);
    }

}
