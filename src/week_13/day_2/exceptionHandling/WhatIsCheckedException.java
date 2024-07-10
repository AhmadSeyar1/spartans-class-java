package week_13.day_2.exceptionHandling;

public class WhatIsCheckedException {
    // Checked exceptions are those exceptions that happen during the compile time.

    public static void main(String[] args) throws InterruptedException {
        printNumberOneToTen();

    }

    public static void printNumberOneToTen() throws InterruptedException {
        for (int number = 1; number <= 10; number++) {
            Thread.sleep(1000);
            System.out.print(number + " ");
        }
    }
}
