package week_9.day_2;

public class Calculator {

    public static void printMessage() {
        System.out.println(" Welcome to Java Class ");
    }

    public static int sumOfTwoNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static void printSumOfTwoNumbers(int numOne, int numTwo) {
        System.out.println("Result of: " + numOne + " + " + numTwo + " = " + sumOfTwoNumbers(numOne, numTwo));
    }
}
