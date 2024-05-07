package com.example.demo.excersises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rounding {

    @Setter
    @Getter
    @AllArgsConstructor
    @ToString
    public static class City {
        private String name;
        private long population;
    }

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new Rounding.City("Nice",942208));
        cities.add(new Rounding.City("Abu Dhabi",1482816));
        cities.add(new Rounding.City("Naples",2186853));
        cities.add(new Rounding.City("Vatican City",572));

        cities = cities.stream()
                .map(city -> {
                    city.setPopulation(toMillion(city.getPopulation()));
                   return city;
                })
                .peek(System.out::println)
                .collect(Collectors.toList());
        /*millionsRounding([
  ["Nice", 942208],
  ["Abu Dhabi", 1482816],
  ["Naples", 2186853],
  ["", 572]
]) ➞ [
  ["Nice", 1000000],
  ["Abu Dhabi", 1000000],
  ["Naples", 2000000],
  ["Vatican City", 0]
]*/
        cities = new ArrayList<>();
        cities.add(new Rounding.City("Manila",13923452));
        cities.add(new Rounding.City("Kuala Lumpur",7996830));
        cities.add(new Rounding.City("Jakarta",10770487));
        System.out.println();
        cities = cities.stream()
                .map(city -> {
                    city.setPopulation(toMillion(city.getPopulation()));
                    return city;
                })
                .peek(System.out::println)
                .collect(Collectors.toList());
        /*millionsRounding([
  ["Manila", 13923452],
  ["Kuala Lumpur", 7996830],
  ["Jakarta", 10770487]
]) ➞ [
  ["Manila", 14000000],
  ["Kuala Lumpur", 8000000],
  ["Jakarta", 11000000]
]*/
    }

    public static long toMillion(long number) {
        return Math.round(number / 1000000f) * 1000000;
    }

}
