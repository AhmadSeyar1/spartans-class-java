package week_6.day_2;

public class LogicalOperatorPractice {
    public static void main(String[] args) {

        if (true) {
            System.out.println("A");
            if (false) {
                System.out.println("B");
            } else {
                System.out.println("C");
                if (true) {
                    System.out.println("Z");
                }
                System.out.println("H");
            }
        } else {
            System.out.println("Java is easy");
        }

    }
}
