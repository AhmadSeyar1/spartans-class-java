package week_6.day_3;

import java.util.Scanner;

public class DiscountExample {
    public static void main(String[] args) {
        // Ternary Operator
 /*
 In an online store, if a user is a member, they get a 10% discount.
 Given the original price of an item and a boolean isMember, calculate and display the final price
 using the ternary operator.
  */
        // variable Declarations
        boolean isMember = true;
        double finalPrice;
        double originalPrince;
        int userChoice;

        // Object of Scanner
        Scanner scnObj = new Scanner(System.in);

        System.out.print("Please enter the original price of the item: ");
        originalPrince = scnObj.nextDouble();

        System.out.println("* * * * * Menu * * * * *");
        System.out.println("Are you member of our online store: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Exit");
        System.out.println("Your choice: ");
        userChoice = scnObj.nextInt();

        switch (userChoice) {
            case 1:
                isMember = true;
                break;
            case 2:
                isMember = false;
                break;
            case 3:
                System.out.println("Thank you!");
                scnObj.close();
            default:
                System.out.println("Invalid number please try again");
        }

        // Calculate the final price using ternary operator
        finalPrice = (isMember) ? originalPrince - (originalPrince * 0.1) : originalPrince;

        // Print the final price user
        if (!isMember) {
            System.out.println("final price: " + finalPrice);
        } else {
            System.out.println("Dear user, your orignal price was " + originalPrince + " we have given " +
                    "your 10% discount, and your final prince is: " + finalPrice);
        }


    }
}
