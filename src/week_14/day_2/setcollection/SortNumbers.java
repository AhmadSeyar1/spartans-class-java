package week_14.day_2.setcollection;

import java.util.TreeSet;

public class SortNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 3, 4, 5, 0, 1, 1, 2, 3, 4, 5};

        TreeSet<Integer> setOfNumbers = new TreeSet<>();

        for (int number : numbers) setOfNumbers.add(number);
        System.out.println(setOfNumbers);//Result: [0, 1, 2, 3, 4, 5, 10]

        System.out.println("* * * * * * * * * *  * *  *");
        char[] charArray = {'q', 'z', 'k', 'b', 'w', 'f', 'y', 'm'};
        TreeSet<Character> setOfCharacters = new TreeSet<>();

        for (char character : charArray) setOfCharacters.add(character);
        System.out.println(setOfCharacters);// [b, f, k, m, q, w, y, z]


    }
}
