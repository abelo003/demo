package com.example.demo.coding;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestCoding {

    public static void main(String[] args) {
        int x = 999;
        int y = 3;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        start.add(x);
        list.add(start);
        //creation
        for (int i = 1; i < y; i ++) {
            list.add(createNextLevel(list.get(i - 1), new ArrayList<>()));
        }
        //printing
        int spaces = 4;
        for (int i = 0 ; i < list.size(); i ++) {
            int initialSpaces = (list.get(list.size() - 1 - i).size() / 2);
            if(i != list.size() - 2) {
                for (int j = 0; j < initialSpaces ; j++) {
                    System.out.print("    ");
                }
            } else {
                for (int j = 0; j < initialSpaces ; j++) {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < list.get(i).size(); j ++) {
                System.out.printf("%"+ (spaces) +"d", list.get(i).get(j));
                for (int t = 0; t < initialSpaces; t ++){
                    System.out.print("    ");
                }
                if(i > 0) {
                    for (int t = 0; t < (initialSpaces * (spaces - 1)) / spaces; t ++){
                        System.out.print("    ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static List<Integer> createNextLevel(List<Integer> parentList, List<Integer> nextLevel) {
        parentList.stream()
                .forEach(node -> {
                    int random = 0;
                    if(node != 0) {
                         random = new Random().nextInt(node);
                    }
                    nextLevel.add(random);
                    nextLevel.add(node - random);
                });
        return nextLevel;
    }

}
