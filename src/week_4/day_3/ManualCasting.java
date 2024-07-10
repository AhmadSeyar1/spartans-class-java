package week_4.day_3;

public class ManualCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println(myDouble);// 9.78
        System.out.println(myInt);// 9

        int doubleValue = (int) 100.87;
        System.out.println(doubleValue); // 100
    }
}
