package com.example.demo.test;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {
        /*
        System.out.println("************************ List ************************");
        System.out.println("************************ ArrayList ************************");
        List<String> list = new ArrayList<>(); // Object[]
        System.out.println(list.add("Hello"));
        System.out.println(list.add("hello"));
        System.out.println(list.add("hello"));
        System.out.println(list.add(null));
        System.out.println("found null: " + list.contains(null));
        System.out.println(list);*/
        /*System.out.println("************************ LinkedList ************************");
        List<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.add("Hello"));
        System.out.println(linkedList.add("hello"));
        System.out.println(linkedList.add("hello"));
        System.out.println(linkedList.add(null));
        System.out.println("found null: " + linkedList.contains(null));
        System.out.println(linkedList);*/

        System.out.println("************************ Set ************************");
        System.out.println("************************ HashSet ************************");
        Set<String> set = new HashSet<>(); // HashMap<E,Object> map
        System.out.println(set.add("Hello"));
        System.out.println(set.add("hello"));
        System.out.println(set.add("hello"));
        System.out.println(set);
        //set.stream().forEach(System.out::println);
        System.out.println("************************ LinkedHashSet ************************");
        Set<String> linkedSet = new LinkedHashSet(); // LinkedHashMap
        System.out.println(linkedSet.add("Hello"));
        System.out.println(linkedSet.add("hello"));
        System.out.println(linkedSet.add("hello"));
        System.out.println(linkedSet);
        System.out.println("************************ TreeSet ************************");
        Comparator<Integer> comparator = ((o1, o2) -> o2.compareTo(o1));
        //Set<Integer> treeSet = new TreeSet<>(comparator);
        Set<Integer> treeSet = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        System.out.println(treeSet.add(5));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(1));
        System.out.println(treeSet);
        System.out.println("size: " + treeSet.size());

        /*System.out.println("************************ Map ************************");
        System.out.println("************************ HashMap ************************");
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map.put(1, 1));
        System.out.println(map.put(2, 2));
        System.out.println(map.put(2, 2));
        System.out.println(map.put(3, 3));
        System.out.println(map.put(17, 17));
        System.out.println(map.put(null, null));
        System.out.println(map);
        System.out.println("************************ HashMap ************************");
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println(linkedHashMap.put(1, 1));
        System.out.println(linkedHashMap.put(2, 2));
        System.out.println(linkedHashMap.put(2, 2));
        System.out.println(linkedHashMap.put(3, 3));
        System.out.println(linkedHashMap.put(17, 17));
        System.out.println(linkedHashMap.put(null, null));
        System.out.println(linkedHashMap);
        System.out.println("************************ TreeMap ************************");
        Map<Integer, Integer> treeMap = new TreeMap<>();
        System.out.println(treeMap.put(17, 17));
        System.out.println(treeMap.put(2, 2));
        System.out.println(treeMap.put(2, 2));
        System.out.println(treeMap.put(3, 3));
        System.out.println(treeMap.put(44, null));
        System.out.println(treeMap.put(1, 1));
        System.out.println(treeMap);*/
    }

}
