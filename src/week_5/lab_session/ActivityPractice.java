package week_5.lab_session;

public class ActivityPractice {
    public static void main(String[] args) {

        // 1. Write a Java program to swap two variables without using a third variable.
        //2. Write a program to check whether a number is even or odd using conditional statement.
        //3. Write a program that calculates the area of a rectangle given its length and width.
        //4. Write a program to find the maximum of three numbers using conditional statement

        int a = 70;
        int b = 30;
        int c;
        System.out.println("Before value of a " + a + " and b: " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("After value of a: + " + a + " and b: " + b);

        // Now without using third variable

        System.out.println("***** ***** ***** ***** ***** *****");

        int e = 60;
        int f = 40;
        System.out.println("before value of e: + " + e + " and f: " + f);
        e = e + f;
        f = e - f;
        e = e - f;

        System.out.println("after value of e: + " + e + " and f: " + f);
    }
}
