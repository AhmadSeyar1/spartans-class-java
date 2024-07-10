package week_5.lab_session;

public class FindMaxNumberBetweenThree {
    public static void main(String[] args) {
        //4. Write a program to find the maximum of three numbers using conditional statement

        int a = 50;
        int b = 70;
        int c = 40;

        if (a > b && a > c) {
            System.out.println("Maximum number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Maximum number is: " + c);
        } else {
            System.out.println("They are equal");
        }

    }
}
