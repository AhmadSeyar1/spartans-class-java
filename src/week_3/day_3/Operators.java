package week_3.day_3;

public class Operators {
    public static void main(String[] args) {
        //Multiplication:
        int num = 100;
        int num2 = 200;
        System.out.println(num * num2);
        int num3 = num * num2;
        System.out.println(num3);

        System.out.println("*********************** ****************");

        //Division:
        System.out.println(100 / 50); // Result: 2
        System.out.println(100 / 50 * 2); // Result: 4
        System.out.println(100 / 5 * 4); // Result: 20
        System.out.println(100 / (5 * 4)); // Result: 5

        int a = 100;
        int b = 40;
        System.out.println(a / b); // Result: 2

        double c = 100;
        double d = 40;
        System.out.println(c / d); // Result: 2.5
    }
}
