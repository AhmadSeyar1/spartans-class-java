package week_6.lab_session;

import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args) {
    /*
    Write a program that is going to check the username of the user and the password
    if the username of the user is spartans and the password is equal to Spartans@123,
    then user should have the access to the system
    if the username matches and password don't
    user should not be granted access

    Note: Use scanner to grab the userNae and password of the user
     */

        String userName = "Spartans";
        String password = "Spartans@123";

        // Declare two variable to get the username and the password of user
        String userEnteredUserName;
        String userEnteredPassword;

        var scnObj = new Scanner(System.in);
        System.out.println("Please enter your UserName: ");
        userEnteredUserName = scnObj.next();
        System.out.println("Please enter your Password: ");
        userEnteredPassword = scnObj.next();

        if (userEnteredUserName.equals(userName) && userEnteredPassword.equals(password)) {
            System.out.println(" Access granted! ");
        } else {
            System.out.println("Invalid userName or Password, Please try again ");
        }
    }
}
