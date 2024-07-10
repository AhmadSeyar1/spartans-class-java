package week_8.day_1;

import java.util.Scanner;

public class WhileLoopActivity {
    public static void main(String[] args) {
        /*
        Ask the user for a number
        Print the multiplication table using while loop
        from start to end point
        where start and end are numbers entered by the user
         */

        // Create Object of Scanner
        var scnObj = new Scanner(System.in);

        // Declare variable to store the values
        int userInput = 0;
        int startPoint = 0;
        int endPoint = 0;

        // Print messages and get userInput
        System.out.print("Please enter a number to print it's multiplication table: ");
        userInput = scnObj.nextInt();

        System.out.print("Please enter the startPoint for multiplication table: ");
        startPoint = scnObj.nextInt();

        System.out.print("Please enter the endPoint for multiplication table: ");
        endPoint = scnObj.nextInt();

        while (startPoint <= endPoint) {
            System.out.println(startPoint + " * " + userInput + " = " + (userInput * startPoint));
            startPoint++;
        }
    }
}
