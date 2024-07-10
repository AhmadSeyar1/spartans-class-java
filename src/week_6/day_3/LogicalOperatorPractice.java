package week_6.day_3;

public class LogicalOperatorPractice {
    public static void main(String[] args) {

        if (false) {//!(true && true || false || false || true ^ true ^ false ^ true && true || true && false)
            System.out.println("A");
            if (true) {
                System.out.println("B");
            } else if (true) {
                System.out.println("C");
            } else {
                System.out.println("Z");
            }
        } else {
            System.out.println("Java is really easy: ");

        }
    }
}
