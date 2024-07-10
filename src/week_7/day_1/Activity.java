package week_7.day_1;

public class Activity {
    public static void main(String[] args) {
        if (!("Bob".equals("BoB") || "Java".equals("isEasy"))) {
            //(!("Bob".equals("BoB") && 10 != 0 || "Java".equals("isEasy") && false ^ true))
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
