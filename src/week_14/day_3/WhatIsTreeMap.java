package week_14.day_3;

import java.util.TreeMap;

public class WhatIsTreeMap {
    /*
    TreeMap is an implementation of the NavigableMap interface in java, which in turn extends
    the sortedMap interface. It stores its elements in key-value pairs similar to other maps.
    However, the primary distinction is that a TreeMap is sorted according to the natural ordering
    of its key or by a comparator provided at map creation time.

     */
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMapOfNames = new TreeMap<>();

        // add elements to TreeMap
        treeMapOfNames.put(1, "Bob");
        treeMapOfNames.put(4, "Tony");
        treeMapOfNames.put(5, "Eric");
        treeMapOfNames.put(2, "Ahmad");
        treeMapOfNames.put(3, "Khan");

        // Print the elements or entries of TreeMap
        System.out.println(treeMapOfNames);// Sorted

    }
}
