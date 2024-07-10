package week_6.day_2;

public class NestedIfStatement {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWeatherCold = false;

        if (isRaining) {
            System.out.println("Yes, it is raining");
            if (isWeatherCold) {
                System.out.println("Wear a jacket and take umbrella");
            } else {
                System.out.println("T-shirt will do, but remember to take umbrella");
            }
        } else {
            System.out.println("Man!, ouside is not raining");
        }
    }
}
