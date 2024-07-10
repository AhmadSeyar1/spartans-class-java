package week_6.day_1;

public class ActivityOne {
    public static void main(String[] args) {
        /*
        1. Basic Decision making:
        You are creating a weather application. based on th temperature, suggest what to wear.
        If the temperature is below 10 degree, display "Wear a heavy coat!"
        If it is between 10 and 20 degrees, suggest "A light jacket will do"
        Otherwise, for any temperature above 20 degrees, show "It is warm, just a t-shirt is fine!"
         */
        int temperature = 10;

        if (temperature < 10) {
            System.out.println("Wear a heavy coat");
        } else if (temperature >= 10 && temperature <= 20) {
            System.out.println("A light jacket will do");
        } else {
            System.out.println("It is warm, just a t-shirt is fine!");
        }
    }
}
