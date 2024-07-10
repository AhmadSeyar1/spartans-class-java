package week_6.day_2;

public class LogicalOROperator {
    public static void main(String[] args) {
        // Using AND Logical Operator
        System.out.println((true)); // true && true
        System.out.println((false)); // true && false
        System.out.println((false)); // false && true
        System.out.println((false)); // false && false

        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        // Using OR logical Operator
        System.out.println((true)); // true || true
        System.out.println((true)); // true || false
        System.out.println((true)); // false || true
        System.out.println((false)); // false || false

        if (true) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }


    }
}
