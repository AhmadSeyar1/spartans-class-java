package week_5.day_3;

import java.util.Scanner;

public class IfElseStatementThree {
    public static void main(String[] args) {
        char grade;
        int marks;
        Scanner scnObj = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        marks = scnObj.nextInt();

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 81) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade + "Marks: " + marks);
    }

}
