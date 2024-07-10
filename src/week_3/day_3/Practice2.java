package week_3.day_3;

public class Practice2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a / b); // It will print 3 because it is not double

        int c = 10;
        int d = 3;
        System.out.println(c % d); // it will print the remainder: 1

        //Print even numbers
        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                System.out.println("EvenNumbers: " + number);
            }
        }
    }
}
