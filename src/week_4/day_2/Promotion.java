package week_4.day_2;

public class Promotion {
    public static void main(String[] args) {
        System.out.println(30 + 30); // 60 --> int
        System.out.println(30 + 30.5); // 60.5--> double
        System.out.println(30 + 305L); // 335 --> long

        int inVariable = 10;
        double doubleVariable = 10.5;

        double result = inVariable + doubleVariable; // double
        //Here int is going to promote into double

        byte byteVariable = 127;
        short shortVariable = 220;
        char charVariable = 'A';
        int intVariable = 1500;

        int result1 = intVariable + byteVariable + shortVariable + charVariable;
        //Always smaller data type are converted to the largest data type
        System.out.println(result1);

        // int + float + long = float
        // byte + int + long = long
        // short + byte + char = int
        // long + float + int = float
        // byte + int + short + float + long + char = float


    }
}
