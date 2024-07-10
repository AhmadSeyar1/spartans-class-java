package week_6.day_2;

public class NestedIfStatement1 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("A");
            if (false) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
            if (5 > 0) {
                System.out.println("Z");
            }
            System.out.println("Spartans");
        } else {
            System.out.println("Java is easy");
        }
    }
}
