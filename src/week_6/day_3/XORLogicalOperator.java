package week_6.day_3;

public class XORLogicalOperator {
    public static void main(String[] args) {
        // XOR (^): Exactly one of the conditions must be true not both
        /*
         * true - true = false.
         * false = true = true.
         * true - false = true.
         * false - false = false.
         */

        System.out.println(false);// 55 > 45 ^ 10 < 20
        System.out.println(true);//55 > 45 ^ 10 < 20 ^ true
        System.out.println(false);//55 > 45 ^ 10 < 20 ^ false
        System.out.println(true);//55 > 45 ^ 10 < 20 ^ false || true

        System.out.println("* * ** * * * * * * * * * * * * * * * * * ");

        String message = "WelomeToTEKschool123#*(!123";

        System.out.println(message);
        System.out.println(message.replaceAll("[^a-z]", ""));//Result: elomeoschool
        System.out.println(message.replaceAll("[^A-Z]", "")); // WTTEK
        System.out.println(message.replaceAll("[^1-3]", "")); // 123123
        System.out.println(message.replaceAll("[A-Z]", "")); // elomeoschool123#*(!123
        System.out.println(message.replaceAll("[0-9]", "")); // WelomeToTEKschool#*(!


        System.out.println(false);//55 > 45 ^ 10 < 20 --> XOR --> false
        System.out.println(true);//55 > 45 || 10 < 20-->OR--> true

    }
}
