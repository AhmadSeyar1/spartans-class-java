package week_5.lab_session;

public class IfStatementReview {
    public static void main(String[] args) {
        int numberOne = 25;
        int numberTwo = 20;

        if (numberOne < numberTwo) {
            System.out.println(numberOne + " is less than " + numberTwo);
        } else if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
        } else {
            System.out.println(numberOne + " is equal " + numberTwo);
        }

        String firstName = "Ahmad";
        String lastName = "Khan";

        if (firstName == lastName) {
            System.out.println("Your first and last name is the same");
        } else {
            System.out.println("Your first and last name is not the same");
        }
    }
}
