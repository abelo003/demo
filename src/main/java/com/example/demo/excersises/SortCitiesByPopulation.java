package com.example.demo.excersises;


import java.util.*;
import java.util.stream.Collectors;

public class SortCitiesByPopulation {

    /**
     * Given an array of cities and populations, return an array where all populations are rounded to the nearest million.
     * Examples
     *
     * millionsRounding([
     *   ["Nice", 942208],
     *   ["Abu Dhabi", 1482816],
     *   ["Naples", 2186853],
     *   ["Vatican City", 572]
     * ]) ➞ [
     *   ["Nice", 1000000],
     *   ["Abu Dhabi", 1000000],
     *   ["Naples", 2000000],
     *   ["Vatican City", 0]
     * ]
     * millionsRounding([
     *   ["Manila", 13923452],
     *   ["Kuala Lumpur", 7996830],
     *   ["Jakarta", 10770487]
     * ]) ➞ [
     *   ["Manila", 14000000],
     *   ["Kuala Lumpur", 8000000],
     *   ["Jakarta", 11000000]
     * ]
     */

    public static void main(String[] args) {
        List<City> cities1 = Arrays.asList(
                new City("Nice", 942208),
                new City("Abu Dhabi", 1482816),
                new City("Naples", 2186853),
                new City("Vatican City", 572)
        );
        List<City> cities2 = Arrays.asList(
                new City("Manila", 13923452),
                new City("Kuala Lumpur", 7996830),
                new City("Jakarta", 10770487)
        );
        System.out.println(millionsRounding(cities1));
        System.out.println(millionsRounding(cities2));

        /*Map<String, Integer> citiesMap1 = Map.of("Nice", 942208, "Abu Dhabi", 1482816, "Naples", 2186853, "Vatican City", 572);
        Map<String, Integer> citiesMap2 = Map.of("Manila", 13923452, "Kuala Lumpur", 7996830,"Jakarta", 10770487);
        System.out.println();
        System.out.println(millionsRoundingMap(citiesMap1));
        System.out.println(millionsRoundingMap(citiesMap2)); */// unordered Maps
    }

    public static Map<String, Integer> millionsRoundingMap(Map<String, Integer> citiesMap){
        return citiesMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, (entry) -> Math.round(entry.getValue() / 1000000f) * 1000000 ));
    }

    public static List<City> millionsRounding(List<City> cities){
        return cities.stream()
                .map(c -> {c.setPopulation(Math.round(c.getPopulation() / 1000000f) * 1000000); return c;})
                .collect(Collectors.toList());
    }

    public static class City {  // inner class
        private String name;
        private Integer population;

        public City(String name, Integer population){
            this.name = name;
            this.population = population;
        }
        public Integer getPopulation(){
            return population;
        }

        public void setPopulation(Integer p){
            this.population = p;
        }
        public String toString(){
            return name + ", " + population;
        }
    }

}

