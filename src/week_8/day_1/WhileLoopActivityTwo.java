package week_8.day_1;

import java.util.Scanner;

public class WhileLoopActivityTwo {
    public static void main(String[] args) {
        // Declare variables
        String firstName = "";
        String lastName = "";
        int userInput = 0;

        // Create object of Scanner
        Scanner scnObj = new Scanner(System.in);

        System.out.println("* * * * * * * Main Menu * * * * * * *");
        System.out.println("1. To submit your firstName");
        System.out.println("2. To submit your lastName");
        System.out.println("3. To print your FirstName");
        System.out.println("4. to print your lastName");
        System.out.println("Select one of the options: ");

        userInput = scnObj.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Please enter your firstName: ");
                firstName = scnObj.next();
                break;
            case 2:
                System.out.println("Please enter your lastName: ");
                lastName = scnObj.next();
                break;
            case 3:
                System.out.println("Your firstName is: " + firstName);
                break;
            case 4:
                System.out.println("Your lastName is: " + lastName);
                break;
            default:
                System.out.println("Invalid enter");
        }
    }
}
