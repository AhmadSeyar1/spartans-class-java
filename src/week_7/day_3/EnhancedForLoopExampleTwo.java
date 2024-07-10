package week_7.day_3;

public class EnhancedForLoopExampleTwo {
    public static void main(String[] args) {

        int countEven = 0;
        int countOdd = 0;
        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};

        // Find and print even numbers from array of numbers
        // int is the data type of the values
        // number is the name of iterator (Can be anything)
        // Conditional, separates the iterator and target location
        // numbers is the name of the target location in which iterator needs to grab the value from.
        

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println();
        System.out.println("We have found " + countEven + " even numbers!");
        System.out.println("We have found " + countOdd + "  odd numbers!");
        /*
        Result:
        10 0 2 4 6 20
        We have found 6 even numbers!
        We have found 7  odd numbers!
         */
    }
}
