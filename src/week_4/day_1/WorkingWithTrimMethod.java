package week_4.day_1;

public class WorkingWithTrimMethod {
    public static void main(String[] args) {
        // Trim method will remove all the spaces before and after

        String message = "             Welocme to my Class           ";
        System.out.println(message);//will be printed with space

        message = message.trim(); // this trim method will remove the space before and after
        System.out.println(message);// will be printed without space
    }
}
