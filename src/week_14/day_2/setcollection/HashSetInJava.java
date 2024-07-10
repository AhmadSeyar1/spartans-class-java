package week_14.day_2.setcollection;

import java.util.HashSet;

public class HashSetInJava {
    /*
    HashSet is one of the most commonly used classes that implements the Set interface.
    It uses a hash table to store elements, which enables constant-time performance for
    basic operations, assuming the hash function disperses elements properly among the buckets.
    - No duplicate values: HashSet not store duplicate values.
    - Unordered: Order of elements not guaranteed
    - Null Values: HashSet allows one null value
     */
    public static void main(String[] args) {

        HashSet<String> setOfNames = new HashSet<>();

        // How to add elements
        setOfNames.add("Ahmad");
        setOfNames.add("Khan");
        setOfNames.add("Tony");

        // Print the elements of Set
        System.out.println(setOfNames);
        //Result: [Tony, Khan, Ahmad] --> Not in order.

        //How to add null value.
        setOfNames.add(null); // only one null value is allowed
        System.out.println(setOfNames);
        //Result: [null, Tony, Khan, Ahmad]

        // How to remove values from Set
        setOfNames.remove("Tony");
        System.out.println(setOfNames);// Tony is removed

        // How to print the size of the set
        System.out.println("Size of the set: " + setOfNames.size());// length

        // Check if the set is empty or not
        System.out.println("Is my set empty? " + setOfNames.isEmpty());

        // Add 10 names to Set

    }
}















