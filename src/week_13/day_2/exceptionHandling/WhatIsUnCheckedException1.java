package week_13.day_2.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhatIsUnCheckedException1 {

    public static void main(String[] args) {

        int numberOne = 0, numberTwo = 0;

        Scanner scanObj = new Scanner(System.in);

        try {
            System.out.print("Please enter the first number");
            numberOne = scanObj.nextInt(); // 10

            System.out.print("Please enter the second number");
            numberTwo = scanObj.nextInt(); // 10

            System.out.println("The result of: " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
            //System.out.println("The result of: " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));

        } catch (InputMismatchException e) {
            System.out.println("Number cannot be added to a character, please try again");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }


}
