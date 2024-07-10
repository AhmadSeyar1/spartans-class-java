package week_7.day_3;

import java.util.Scanner;

public class EnhancedForLoopExampleThree {
    public static void main(String[] args) {

        /*
    Print Array Elements
    You are given an array of integers: int [] numbers = {3,7,2,8,5};
    Write a program using a for loop that prints the elements in the array.
    keep a running total and add each array element to this total during each iteration of the loop
     */
        // Note: Use scanner to get the input of the user
        // Based on the input of the user, decide between printing odd or even numbers

        // For example:
        // 1. print Even numbers
        // 2. print Odd numbers
        // Please select one of the options: X
        // if y --> Invalid Entry, Please try gaing.

        // if user enters 1, --> print even numbers
        // else, print odd numbers

        // Preparing the data in which you need to complete your code
        int userInput;
        int countEven, countOdd = 0;

        var scnObj = new Scanner(System.in);
        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};

        // Actions:
        System.out.println("1. print Even numbers ");
        System.out.println("2. print Odd numbers ");
        System.out.print("Please select one of the options: ");
        userInput = scnObj.nextInt();
        if (userInput != 1 || userInput != 2) System.out.println("Invalid enter, please re-enter the option!");

        switch (userInput) {
            case 1:
                for (int num : numbers) {
                    if (num % 2 == 0) System.out.println(num);
                }
                break;
            case 2:
                for (int num : numbers) {
                    if (num % 2 != 0) System.out.println(num);
                }
                break;
            default:
                System.out.println("Invalid entery");
        }
    }
}
