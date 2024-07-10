package week_13.day_2.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HwoToHandleUncheckedException {

    public static void main(String[] args) {


        try {

            var scanner = new Scanner(System.in);

            int numberOne, numberTwo;

            System.out.println("Enter the first Number: ");
            numberOne = scanner.nextInt();

            System.out.println("Enter the second Number: ");
            numberTwo = scanner.nextInt();

            System.out.println("Result: " + numberOne / numberTwo);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the number by Zero");
        } catch (InputMismatchException e) {
            System.out.println("Cannot divide the number by character");
        }

    }
}
