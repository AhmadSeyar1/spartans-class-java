package week_15.day_1;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(); // one way
//        List<String> vectorTwo = new Vector<>(); // second way
//        var vectorThree = new Vector<String>(); // third way

        // add elements to vector
        vector.add(0, "Tony");
        vector.add("Bob");
        vector.add("Trevor");

        System.out.println(vector);

        for (String element : vector) {
            System.out.println(element);
        }
        // How to remove element from vector
        vector.remove("Trevor");
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        System.out.println(vector.size());// check how many element is in vector

        vector.clear();
        System.out.println(vector); // Clear everything

        System.out.println(vector.isEmpty());// Result is True because now vector is empty

    }
}
















