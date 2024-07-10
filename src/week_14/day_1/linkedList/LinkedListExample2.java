package week_14.day_1.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        String[] names = {"Ahmad", "Khan", "Tony", "Tom", "Erin", "Eric"};
        List<String> listOfNames = new LinkedList<>();

        // add
        Collections.addAll(listOfNames, names);
        System.out.println(listOfNames);



       /*
        listOfNames.clear(); // will clear the list
        System.out.println(listOfNames);
        */

    }
}
