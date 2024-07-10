package week_5.day_1;

import java.util.Scanner;

public class ScannerEmployee {
    public static void main(String[] args) {


        int id;
        String firstName;
        String lastName;
        String jobTitle;
        String dateOfBirth;
        // Capture the information (data) from the user.
        // Scanner
        // To capture the information or input from keyboard;

        Scanner userInput = new Scanner(System.in);

        // Syntax of how we read information
        // variableName = scannerName.MethodNameByDataType();
        System.out.println("Please enter your ID: ");
        id = userInput.nextInt();

        System.out.println("Please enter your FirstName: ");
        firstName = userInput.next();

        System.out.println("Please enter your LastName: ");
        lastName = userInput.next();

        System.out.println("Please enter your jobTitle: ");
        jobTitle = userInput.next();

        System.out.println("Please enter your dateOfBirth: ");
        dateOfBirth = userInput.next();
        
        System.out.println("Your ID is: " + id);
        System.out.println("Your firstName is: " + firstName);
        System.out.println("Your lastName is: " + lastName);
        System.out.println("Your jobTitle is: " + jobTitle);
        System.out.println("Your dateOfBirth is: " + dateOfBirth);


        // next(): for a single line
        // nextLine(): for multiple lines
        // nextInt(): for int values
        // nextShort(): for short values
        // nextByte(): for Byte values
        // nextLong(): for long values
        // nextFloat(): for float values
        // nextDouble(): for double values
    }
}

