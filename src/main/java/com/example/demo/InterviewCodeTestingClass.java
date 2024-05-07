package com.example.demo;

import java.util.HashMap;

public class InterviewCodeTestingClass {

    public static void main(String[] args) {
        //integer array 1,2,3, permutations
        //123,
        //132,
        /*int array[] = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length; j++) {
                System.out.print(array[j % array.length] + " ");
            }
            System.out.println(" ");
        }*/

        //Credict card num, name of card holder
        //lest that 16 digits
        HashMap<String, String> cards = new HashMap<>();
        cards.put("123456789098765", "Mike Jon");
        cards.put("1234567890987654", "Joe Biden");
        cards.put("12334567890987654", "Martin Losa");

        cards.entrySet().stream()
                .filter(stringStringEntry -> stringStringEntry.getKey().length() < 16)
                .forEach(System.out::println);
        /*
        Entity
                employee
                    id: pk
                department
                    idDepart
                    idEmployee fk employee
          query for department doesn't have any employee

                select from department
                where idEmployee = null
        */
    }

}
