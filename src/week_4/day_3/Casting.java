package week_4.day_3;

public class Casting {
    public static void main(String[] args) {
        //There are two types of casting
        // 1- Widening Casting (Automatically): Converting a smaller data type to larger data type
        // 2- Narrowing Casting (Manually): Converting a larger data type to a smaller one.
        
        // in Manual Casting you will lose some value
        int intValue = 10; // int is smaller then double
        double doubleValue = 25.18; // double is bigger then int

        double result = intValue + doubleValue; // Here we used double, if we use int then it has to be
        //used casting because int is smaller then double and it will lost some value. For example
        System.out.println(result); // 30.18

        int result1 = (int) (intValue + doubleValue); //This process is called casting
        System.out.println(result1); // result is 35


    }
}
