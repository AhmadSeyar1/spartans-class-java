package week_2.day_1;

public class DataType {
    public static void main(String[] args) {
        int number = 10;
        String firstName = "Johan";
        double floatingPointNumber = 10.5;
        double floatingPointNumber2 = 10;
        char characterValue = 'A';
        boolean isLightOn = true;

        int a = 20;
        int b = 30;
        int resultOfTwoNumbers = a + b;

        System.out.println(number);
        System.out.println(firstName);
        System.out.println(floatingPointNumber);
        System.out.println(floatingPointNumber2);
        System.out.println(characterValue);
        System.out.println(isLightOn);
        System.out.println(resultOfTwoNumbers);

        String firstName1;  // Called declaration
        String lastName;    // Called declaration
        String middleName;  // Called declaration

        firstName1 = "Ahmad";  // Called Initialization
        lastName = "Khan";     // Called Initialization
        middleName = "Sohail"; // Called Initialization

        System.out.println(firstName1);

        firstName1 = "John";  // Called Modification
        lastName = "Samad";     // Called Modification
        middleName = "Baran"; // Called Modification

        System.out.println(firstName1);

        int number2 = 10; // declaration and Initialization
        number = 20;     // Modification


        // Non-Decimal Values
        byte byteNumber = 127; // max value of byte
        short shortNumber = 32767; // max value of short
        int intNumber = 2147483647; // max value of int
        long longNumber = 9223372036854775807L; // max value of long

        //Decimal Values
        float floatNumber = 3.5F;
        double doubleNumber = 10.6;

        // Print the minimum and maximum values of Byte data type.
        System.out.println("Min value of Byte:" + Byte.MIN_VALUE);
        System.out.println("Max value of Byte:" + Byte.MAX_VALUE);
        // Print the minimum and maximum values of short data type.
        System.out.println("Min value of short:" + Short.MIN_VALUE);
        System.out.println("Max value of short:" + Short.MAX_VALUE);
        // Print the minimum and maximum values of int data type.
        System.out.println("Min value of int:" + Integer.MIN_VALUE);
        System.out.println("Max value of int:" + Integer.MAX_VALUE);
        // Print the minimum and maximum values of Long data type.
        System.out.println("Min value of long:" + Long.MIN_VALUE);
        System.out.println("Max value of long:" + Long.MAX_VALUE);
        // Print the minimum and maximum values of float data type.
        System.out.println("Min value of float:" + Float.MIN_VALUE);
        System.out.println("Max value of float:" + Float.MAX_VALUE);
        // Print the minimum and maximum values of double data type.
        System.out.println("Min value of double:" + Double.MIN_VALUE);
        System.out.println("Max value of double:" + Double.MAX_VALUE);


    }
}
