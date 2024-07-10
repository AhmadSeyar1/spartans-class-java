package week_9.day_1;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        //Object of Scanner
        var scnObj = new Scanner(System.in);

        int userInput = 0;

        // Variables to store firstName and lastName
        String firstName = "";
        String lastName = "";
        System.out.println("Please enter your firstName: ");
        firstName = scnObj.next();
        System.out.println("Please enter your lastName: ");
        lastName = scnObj.next();

        System.out.println("* * * * * * * * * * Menu * * * * * * * * * * ");
        System.out.println("1. print full Name: ");
        System.out.println("2. print first Name: ");
        System.out.println("3. print last Name: ");
        System.out.print("Select one Option: ");
        userInput = scnObj.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Your fullName is: " + firstName + " " + lastName);
                break;
            case 2:
                System.out.println("Your firstName is: " + firstName);
                break;
            case 3:
                System.out.println("Your firstName is: " + lastName);
            default:
                System.out.println("Invalid entry");
        }

    }
}
