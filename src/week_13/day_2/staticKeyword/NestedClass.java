package week_13.day_2.staticKeyword;

public class NestedClass { // OuterClass
    static String firstName = "John"; // static

    String lastName; // not static

    static class InnerClass {

        public static void main(String[] args) {
            var obj1 = new NestedClass();
            obj1.lastName = "Alexander";

            System.out.println("Your first name is: " + firstName); //Static
            System.out.println("Your last name is: " + obj1.lastName); //non Static

            // Static members can access each other directly without creating object
            // None static members cannot access each other directly you must create
            // object of the class to access its properties.

            /*
            Note: It depends on when you should use static for example our class name
            is Spartans and 30 student are in the class if you make the first name static
            the first name of all the students will be one name because static is not belongs
            to the object it belongs to the class itself. But if you static name of the class
            it is good because we have only one name and doesn't need to create object and
            change the name of the class.

             */
        }
    }
}
