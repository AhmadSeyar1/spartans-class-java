package week_5.lab_session;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        //Write a program that calculates the area of a rectangle given its length and width.

        // Declare three variables
        double width, length, area;

        Scanner scnObj = new Scanner(System.in);

        //print and get data from the user
        System.out.print("Please enter the length of the rectangle: ");
        length = scnObj.nextDouble();

        System.out.print("Please enter the width of the rectangle: ");
        width = scnObj.nextDouble();

        // Calculate the area of the rectangle.
        area = length * width;

        //print the area oa the rectangle.
        System.out.println("The area of the rectangle with length of " + length + " and width of "
                + width + " is = " + area);

    }
}
