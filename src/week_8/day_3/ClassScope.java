package week_8.day_3;

public class ClassScope {
    /*
    2. Class Scope (Instance Scope):
    Variables declared in a class, but outside of any method, are instance variable (Class Scope).
    They belong to an object (an instance of the class) and are accessible from any non-static
    method within the class.
     */

    String firstName = "Bob"; // Class level Variable
    int number = 0; // Class level variable

    public static void main(String[] args) {
        // to access class level variable inside the main method
        // first you should create object of the class

        ClassScope obj = new ClassScope(); // Object of the class to access their properties
        //  System.out.println(firstName); // Cannot be accessed directly without calling object
        System.out.println(obj.firstName);// firstName can be accessed through the object


    }

    public void printFirstName() {
        firstName = "Ahmad";
        System.out.println(firstName);// Can be accessible because it is a non-static method
    }

}
