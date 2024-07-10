package week_5.day_2;

public class IfStatementActivity2 {
    public static void main(String[] args) {

        if (20 < 50) {
            System.out.println("20 is less than 50");
        } else {
            System.out.println("20 is not less than 50");
            System.out.println("50 is greater than 20");
        }

        boolean isWeatherClear = false;
        if (isWeatherClear) {
            System.out.println("Yes, the weather is clear! ");
        } else {
            System.out.println("No, the weather is not clear");
        }

        boolean isRaining = false;
        boolean hasUmbrella = true;
        boolean isWindy = false;

        //First Condition

        if (isRaining) {
            System.out.println("Don't go outside");
        } else {
            System.out.println("You can go outside! ");
        }
        //Second Condition

        if (hasUmbrella) {
            System.out.println("You can go! ");
        } else {
            System.out.println("You cannot go outside! ");
        }

        // Third Condition

        if (isWindy) {
            System.out.println("Wear windbreaker! ");
        } else {
            System.out.println("No need to wear Windbreaker! ");
        }

    }
}
