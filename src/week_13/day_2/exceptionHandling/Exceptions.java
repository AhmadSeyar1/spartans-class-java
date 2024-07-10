package week_13.day_2.exceptionHandling;

public class Exceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Hello World");

            System.out.println(10 / 0); // This is called unchecked exception
            //Unchecked exceptions are happening during the runtime.


        } catch (ArithmeticException e) {
            System.out.println("The number cannot be divided by zero");
        }
        System.out.println("Welcome to Java Class");

        System.out.println("Java is easy");
    }
}
