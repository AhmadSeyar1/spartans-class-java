package week_8.day_1;

public class DoWhileLoop {
    public static void main(String[] args) {

        // When a loop is going to run?
        // When the condition is true

        //Initialization
        // do {
        // Iteration
        // } while (Condition);

        // Print a student name based on the condition 5 times.

        //Using do while loop
        int attempts = 1;
        do {
            System.out.println("Bob");
            attempts++;
        } while (attempts < 1);
        // Even if the condition is false it will print once
        // Do while loop print first and then check the condition
    }
}
