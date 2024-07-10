package week_14.day_1.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        String[] names = new String[2];// Declaration and initialization of array

        // Declare and initialize an arrayList

        ArrayList<String> listOfNames = new ArrayList<>(); // One Way to create object of ArrayList
        List<Integer> ListOfVehicleNames = new ArrayList<>();// Another way to create object of ArrayList
        var listOfNumbers = new ArrayList<String>(); // Third way
        //ArrayList<Booleans> listOfBooleans = new ArrayList<> ();

        // How to add elements to arrayList
        // add ();
        listOfNames.add("Alex");
        listOfNames.add("John");
        listOfNames.add("Tony");

        // How to print or access the elements of array list
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
        // Access all elements of array list
//        for (String name : listOfNames) {
//            System.out.println(name + " ");
//        }


    }
}












