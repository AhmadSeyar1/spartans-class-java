package week_14.day_1.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // LinkedList Example

        String[] names = new String[2];// Declaration and initialization of array


        LinkedList<String> listOfNames = new LinkedList<>();

        // add ();
        listOfNames.add("Alex");
        listOfNames.add("John");
        listOfNames.add("Tony");

        // How to print or access the elements
        System.out.println(listOfNames);
        System.out.println("Value stored at index number 0: " + listOfNames.get(0));

        listOfNames.add(1, "Ahmad");//Ahmad added in index 1
        System.out.println(listOfNames.get(1));
        System.out.println(listOfNames);

        // How to remove elements from array list.
        listOfNames.remove("Ahmad");// Ahmad will be removed
        System.out.println(listOfNames);

        // You can also remove it by index number
        listOfNames.remove(1); // index 1 removed
        System.out.println(listOfNames);

        listOfNames.remove(listOfNames.size() - 1);//It will remove last element
        System.out.println(listOfNames);
    }
}
