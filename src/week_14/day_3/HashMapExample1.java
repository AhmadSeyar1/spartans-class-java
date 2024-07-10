package week_14.day_3;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {

        //Different ways to create Object of HashMap
        HashMap<Integer, String> myMap = new HashMap<>(); // first way

//        Map<Integer, String> myMapTwo = new HashMap<>(); // second way
//        var myMapThree = new HashMap<Integer, String>(); // third say

        //Hwo to add entries
        // put
        myMap.put(1, "Ahmad");
        myMap.put(2, "Khan");
        myMap.put(3, "Tony");
        myMap.put(4, "Eric");

        // How to print entries of Map.
        System.out.println(myMap);

        // How to retrieve information or entries from Map
        System.out.println(myMap.get(1)); // Result: Ahmad

        //How to replace or update the value in Map
        myMap.put(1, "Jawad"); // Ahmad replaced with Jawad

        // Print the updated Map
        System.out.println(myMap);

        // how to check if specific value exist in my map
        System.out.println(myMap.containsKey(2)); // True
        System.out.println(myMap.containsKey(15)); // false

        // how to check based on value if specific value exist in my map
        System.out.println(myMap.containsValue("Khan"));// true

        // how to remove an entry from Map
        System.out.println(myMap.remove(1)); // Jawad is removed
        System.out.println(myMap);

        // Retrieve all the keys stored in Map
        System.out.println(myMap.keySet());

        // Retrieve all the values stored in Map
        System.out.println(myMap.values());

        // Retrieve all the keys and values stored in Map
        System.out.println(myMap.entrySet());


    }
}
