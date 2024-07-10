package week_6.day_1;

import java.util.Scanner;

public class ConditionalStatementExampleOne {
    public static void main(String[] args) {

        int userInput;
        String daysOfTheWeek;

        Scanner scnObj = new Scanner(System.in);
        userInput = scnObj.nextInt();

        daysOfTheWeek = (userInput == 1) ? "Monday" : "Tuesday";
        System.out.println("Week Day: " + daysOfTheWeek);

        System.out.println("**** **** **** **** **** ****");


    }
}
