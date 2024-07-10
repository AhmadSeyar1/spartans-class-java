package week_14.day_2.setcollection;

import java.util.HashSet;

public class InterviewQuestion2 {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10};

        HashSet<Integer> setOfNumbers = new HashSet<>();
        int countDuplicates = 0;

        // Get the count of duplicate values.
        for (int number : numbers) {
            if (!setOfNumbers.add(number)) {
                System.out.print(number + " ");
                countDuplicates++;
            }
        }
        System.out.println();
        System.out.println("There are " + countDuplicates + " duplicate values in array!");
    }
}
