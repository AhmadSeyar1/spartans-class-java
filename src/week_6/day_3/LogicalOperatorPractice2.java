package week_6.day_3;

public class LogicalOperatorPractice2 {
    public static void main(String[] args) {
        if (true) { //!(10 > 20 && true || false ^ true ^ true && false && false && false && false)
            System.out.println("Java");
            if (true) {//true || true || true || true ^ true && false
                System.out.println(" Java");
            } else if (true) {
                System.out.println(" Is");
            } else if (true) {
                System.out.println(" EASY!");
            } else {
                System.out.println("Java is really easy");
            }
        } else
            System.out.println("Yup, it is easy!");
    }
}
