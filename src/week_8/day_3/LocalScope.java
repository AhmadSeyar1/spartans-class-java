package week_8.day_3;

public class LocalScope {

    /*
        1. Local Scope (Method/Block Scope):
        Variables declared within a method or block are local to that method block
        They cannot be accessed outside of that method or block.
        Their Lifetime starts when the method or block is entered and ends when it exits.
         */
    public static void main(String[] args) { // Main method Block opened

        int number = 10;
        String firstName = "Bob";

        System.out.println(number);
        System.out.println(firstName);

    } // Main method Block closed

    // System.out.println(number); // Outside of the main block or method (out of Scope)
    // System.out.println(firstName); // Outside of the main block or method (out of scope)

}
