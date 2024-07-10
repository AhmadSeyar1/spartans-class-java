package week_14.day_2.setcollection;

import java.util.LinkedHashSet;

public class WhatIsLinkedHashSet {
// LinkedHashSet is similar to HashSet on difference is that HashSet add value without order
    // but LinkedHashSet is adding the value based on orders

    public static void main(String[] args) {

        // Create an object of LinkedHashSet
        LinkedHashSet<String> setOfNames = new LinkedHashSet<>();

        // Add elements to LinkedHashSet
        setOfNames.add("Ahmad");
        setOfNames.add("Khan");
        setOfNames.add("Tony");
        setOfNames.add("Tom");

        // How to print the elements
        System.out.println(setOfNames);

        // How to print the values from LinkedHashSet
        setOfNames.remove("Ahmad");
        System.out.println(setOfNames);

    }

}













