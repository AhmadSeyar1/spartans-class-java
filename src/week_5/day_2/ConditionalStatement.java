package week_5.day_2;

public class ConditionalStatement {
    public static void main(String[] args) {

        System.out.println(20 < 50); // true
        System.out.println(50 < 20); // false

        //
        //
        //The reason why you guys are seeing true and false is Whenever you run
        // any condition, it doesn't matter what type of condition always compiler
        // is going to give you a boolean in return.

        // If 20 is less than 50, print, 20 is less than 50.

        //If Control statement:

        //If Statement Syntax
        // if (Condition) { } --> this condition give us either true or false
        //If the condition is true the block of code inside if statement is going to be executed.
        //IF the condition is not ture than the block of code is not going to be executed.

        boolean isRaining = true; // here the condition is true.

        if (isRaining) {
            System.out.println("Take umbrella with your! ");
        } else {
            System.out.println("You don't need to take umbrella with you! ");
        }
    }
}
