package week_7.day_1;

public class StaticInitializationOfArray {
    public static void main(String[] args) {

        // Declare an array of size 3
        int[] numbers = new int[3];

        // Store values into three different available slots
        numbers[2] = 20;
        numbers[1] = 30;
        numbers[0] = 60;

        // Print the values stored in those slots
        System.out.println("Value stored at index 0 = " + numbers[0]);
        System.out.println("Value stored at index 1 = " + numbers[1]);
        System.out.println("Value stored at index 2 = " + numbers[2]);
    }
}
