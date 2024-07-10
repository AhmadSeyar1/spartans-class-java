package week_7.lab_session;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        /*
        Write a java program which is going to convert C to F.
        Prompt the user to enter a C temp and then convert it to F
        At the end, display the converted result into the console.
         */
        // Declare the Scanner
        var scnObj = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        // Prompt the user for input
        System.out.println("Please enter celsius to convert into fahrenheit");
        celsius = scnObj.nextDouble();

        // Converted Formula: F = (°C) * 9/5) + 32
        fahrenheit = (celsius * 9 / 5) + 32;

        // Display the converted value to user
        System.out.println(celsius + " is equal to " + fahrenheit);
        // Result: 50.0 is equal to 122.0
        System.out.println((int) celsius + " is equal to " + (int) fahrenheit);
        // Result: 50 is equal to 122
    }
}
