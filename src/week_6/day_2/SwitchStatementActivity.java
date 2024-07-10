package week_6.day_2;

import java.util.Scanner;

public class SwitchStatementActivity {
    public static void main(String[] args) {
        /*
        1. Display your Name
        2. Display your lastName
        3. Display your dateOfBirth
        4. Display name and lastName
         */

        /*
        If I press option 1
        John
         */

        String firstName, lastName, datOfBirth;
        int userChoice;

        // Scanner Object
        Scanner scnObj = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        firstName = scnObj.next();
        System.out.print("Enter your lastName: ");
        lastName = scnObj.next();
        System.out.print("Enter your dateOfBirth: ");
        datOfBirth = scnObj.next();

        System.out.println("* * * * * * * * * Menu * * * * * * * * * *");
        System.out.println("Please select one of the options");
        System.out.println("1. Display your Name");
        System.out.println("2. Display your lastName");
        System.out.println("3. Display your dateOfBirth");
        System.out.println("4. Display name and lastName");
        System.out.println("User Choice: ");
        userChoice = scnObj.nextInt();
        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        switch (userChoice) {
            case 1:
                System.out.println("Your firstName is: " + firstName);
                break;
            case 2:
                System.out.println("Your lastName is: " + lastName);
                break;
            case 3:
                System.out.println("Your dateOfBirth is: " + datOfBirth);
                break;
            case 4:
                System.out.println("Your full name is: " + firstName + " " + lastName);
            default:
                System.out.println("Invalid choice");
        }


    }
}
