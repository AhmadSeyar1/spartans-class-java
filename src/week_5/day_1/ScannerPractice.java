package week_5.day_1;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        int age;
        int phone;
        String name;
        String city;
        String country;

        System.out.print("Please enter your age: ");
        age = info.nextInt();
        System.out.println("Your age is: " + age);

        System.out.print("Please enter your phone number: ");
        phone = info.nextInt();
        System.out.println("Your phone is: " + phone);

        System.out.print("Please enter your name: ");
        name = info.next();
        System.out.println("Your Name is: " + name);

        System.out.print("Please enter your city name: ");
        city = info.next();
        System.out.print("Your city is: " + city);

        System.out.print("Please enter your country name: ");
        country = info.next();
        System.out.println("Your country is: " + country);


    }
}
