package week_9.day_1;

public class MethodExample {

    // Main method --> Main method is one of the Build-in Methods
    public static void main(String[] args) {
        // To run your program.
        // It's the entry point of your project or program.

        String fullName = "Ahmad";
        System.out.println(fullName);

        // How to call a method
        // nameOfYourMethod();
        // Example I call the below created method
        printFullName();
        printMenu();

        // Now calling Build-in Methods
        System.out.println(fullName.length()); // .length is Build-in Method
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());

        // If both methods are static you can directly call them
        // If not static then you must create object of the method.

    }
    // If you create a method by your self that is User Defined Method
    // You cannot create one method inside another method.

    //User Defined Method

    public static void printFullName() {
        System.out.println("Ahmad Khan");
    }

    public static void printMenu() {
        System.out.println("* * * * * Menu * * * * *");
        System.out.println("1. Print your firstName: ");
        System.out.println("2. Print your lastName: ");
        System.out.println("3. Print your fullName: ");
    }

    public void printFullName2() {
        System.out.println("Mike Toyson");
    }

    public void printMenuTwo() {
        System.out.println("* * * * * Menu * * * * *");
        System.out.println("1. Print your Address: ");
        System.out.println("2. Print your Phone: ");
        System.out.println("3. Print your E-Mail: ");
    }
}
