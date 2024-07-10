package week_5.lab_session;

import java.util.Scanner;

public class IfStatementActivity {
    public static void main(String[] args) {
        // Declare variables
        String firstName;
        String lastName;

        // Create object of scanner to get the user input
        Scanner scnObj = new Scanner(System.in);
//        var scnObj = new Scanner(System.in);
        // Your can also use var instead of the first Scanner

        System.out.print("Write your first name: ");
        firstName = scnObj.next();
        System.out.print("Write your lastName: ");
        lastName = scnObj.next();

        if (firstName.equals(lastName)) {
            System.out.println("Your first name is the same as your lastName");
        } else {
            System.out.println("Your first name is not the same as your lastNane");
        }
    }
}
