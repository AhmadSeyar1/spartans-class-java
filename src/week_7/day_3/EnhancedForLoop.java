package week_7.day_3;

public class EnhancedForLoop {
    public static void main(String[] args) {

    /*
    Enhanced For Loop or For Each Loop: it is the enhanced version of for Loop
     * for(Data type, name of your iterator: Target location) {}
     * String name = "Bob"

     */
        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};

        // Using For Loop
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
            //Result: 10 0 1 2 3 4 5 6 11 20 23 87 89
        }

        System.out.println();
        // Enhanced For Loop
        for (int number : numbers) {
            System.out.print(number + " ");
            //Result: 10 0 1 2 3 4 5 6 11 20 23 87 89
        }
        System.out.println();

        String[] names = {"Ahmad", "Nabi", "Khan"};
        for (String name : names) {
            System.out.print(name + " ");
            //Result: Ahmad Nabi Khan
        }

    }
}
