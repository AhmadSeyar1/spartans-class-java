package week_8.day_2;

public class NestedLoop2Example {
    public static void main(String[] args) {

        int numberOfCombination = 0;

        for (int i = 10; i <= 100; i++) { // Outer loop
            for (int j = 1; j <= 3; j++) { // inner loop
                System.out.println(i + " " + j);
                numberOfCombination++;

            }
        }
        System.out.println("There are " + numberOfCombination + " number of combinations!");

    }
}
