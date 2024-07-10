package week_5.day_2;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        String phoneNumber;
        String firstName;
        String lastName;
        double salary;
        String city;

        Scanner employee = new Scanner(System.in);

        System.out.println("Please enter your phoneNumber: ");
        phoneNumber = employee.next();

        System.out.println("Please enter your firstName: ");
        firstName = employee.next();

        System.out.println("Please enter your lastName: ");
        lastName = employee.next();

        System.out.println("Please enter your salary: ");
        salary = employee.nextDouble();

        System.out.println("Please enter your city: ");
        city = employee.next();

    }
}
