package week_4.day_2;

public class EqualMethod {
    public static void main(String[] args) {

        // equals(): Compares the actual value of String rather than their reference.
        String firstName = "Ahmad";
        String lastName = "Ahmad";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.equals(lastName));// true

        firstName = "Khan";
        lastName = "John";
        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName.equals(lastName)); // false

    }
}
