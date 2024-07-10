package week_7.lab_session;

public class WorkingWithForLoopExmapleTwo {
    public static void main(String[] args) throws InterruptedException {
        // Print the number from 10 to 0
        for (int number = 10; number >= 0; number--) {
            Thread.sleep(1000);
            System.out.println(number);
        }
    }
}
