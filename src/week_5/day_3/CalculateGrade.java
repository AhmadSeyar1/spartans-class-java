package week_5.day_3;

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {

        char grade;
        int marks;
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = scobj.nextInt();

        if (marks <= 100 && marks >= 90) {
            grade = 'A';
        }


    }
}
