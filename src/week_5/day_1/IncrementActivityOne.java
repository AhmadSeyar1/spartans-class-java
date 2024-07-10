package week_5.day_1;

public class IncrementActivityOne {
    public static void main(String[] args) {

        //Increase the value of numberOne by 1.
        //Expected Output: 11

        int numberOne = 10;
        System.out.println(numberOne); //10
        System.out.println(numberOne + 1);//11
        System.out.println(numberOne + 1);//11

        // Pre-Increment --> ++ numberONe
        System.out.println("Original Value: " + numberOne);
        System.out.println("Original Value: " + ++numberOne);//Pre-Increment
        System.out.println("Updated Value: " + numberOne);//11

        int num = 100;
        System.out.println(num); // 100
        System.out.println(++num); //101->First increment then print

        // Post-Increment --> numberOne ++
        System.out.println(numberOne++);// 11
        System.out.println(numberOne);// 12

        int num1 = 50;
        System.out.println(num1); //50
        System.out.println(num1++);//50-> First print then increment
        System.out.println(num1); //51->increment


    }
}
