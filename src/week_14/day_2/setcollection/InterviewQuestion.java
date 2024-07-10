package week_14.day_2.setcollection;

import java.util.HashSet;

public class InterviewQuestion {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10};

        HashSet<Integer> setOfNumbers = new HashSet<>();

        // Print removed the duplicate values
        // Get the count of duplicate values.
        for (int number : numbers) {
            setOfNumbers.add(number);
        }
        System.out.println(setOfNumbers);// Result: [0, 1, 3, 4, 5, 10, 15]

    }
}











