package week_14.day_3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class WhatIsLinkedHashMap {
    /*
    LinkedHashMap is a subclass of HashMap and also implements the Map interface. It maintains
    a doubly-linked list running through all of its entries, which ensures the order of the
    key-value pairs. This order can either be the order in which keys were inserted into the
    map (insertion order) or the order in which keys were last accessed, from least-recently
    accessed to most-recently (access order).
     */
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> mapOfNames = new LinkedHashMap<>();
        HashMap<Integer, String> hashMapOfNames = new HashMap<>();

        // add elements to HashMap
        hashMapOfNames.put(1, "Bob");
        hashMapOfNames.put(4, "Tony");
        hashMapOfNames.put(5, "Eric");
        hashMapOfNames.put(2, "Ahmad");
        hashMapOfNames.put(3, "Khan");

        // add elements to LinkedHashMap
        mapOfNames.put(1, "Bob");
        mapOfNames.put(4, "Tony");
        mapOfNames.put(5, "Eric");
        mapOfNames.put(2, "Ahmad");
        mapOfNames.put(3, "Khan");

        // Print the elements or entries of HashMap
        System.out.println(hashMapOfNames); // Sorted by the keys

        // Print the elements or entries of linkedHashMap
        System.out.println(mapOfNames);// It is by insertion order
    }
}
