package week_5.day_3;

public class IfElseStatement {
    public static void main(String[] args) {

        int number = 18;

        if (number < 20) {
            System.out.println(number + " is less than 20");
        } else if (number > 22) {
            System.out.println(number + " is greater than 20");

        } else {
            System.out.println(number + " is not greater or less then 20");
        }


        // Students' Marks:
        // 90 - 100  = A
        // 81 - 89 = B
        // 71 - 80 = C
        // 70 < = F


        int grade = 70;

        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grad is: A");
        } else if (grade >= 81 && grade <= 89) {
            System.out.println("Your grade is: B");

        } else if (grade >= 71 && grade <= 80) {
            System.out.println("Your grade is: C");

        } else {
            System.out.println("Your grade is: F");
        }


    }
}
