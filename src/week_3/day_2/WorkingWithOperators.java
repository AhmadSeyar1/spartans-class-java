package week_3.day_2;

public class WorkingWithOperators {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;
        int result = numberOne + numberTwo;
        System.out.println("Result: " + result);
        System.out.println(numberOne + numberTwo); // You can do both options
        System.out.println("Result: " + numberOne + numberTwo); //will print (Result: 1020)
        //Because we used string with plus sing which concatenate them.
        System.out.println("The sum of  " + numberOne + " + " + numberTwo + " = " + result);
        // Will print: The rum of  10 + 20 = 30


        int x = 20;
        int z = 40;
        int y = x + z;
        System.out.println(y);

        char n = 'A'; // the number for letter A is 65
        int b = 10;
        System.out.println(n + b); // result is 75

        String v = "30"; // it will concatenate because we have it is string
        int m = 30;
        System.out.println(v + m); // the result is: 3030 not 60

        int number = 100; //It will first 100+50=150 then concatenate with string
        int number2 = 50;
        String name = "tony";
        int number3 = 50;
        System.out.println(number + number2 + name + number3); // The result is: 150tony50

        // Subtraction:

        int number4 = 50;
        int number5 = 30;
        int subtractResult = number4 - number5;
        System.out.println(subtractResult);// the result is 20

        int totalNumberOfApples = 250;
        totalNumberOfApples = totalNumberOfApples - 50;
        totalNumberOfApples = totalNumberOfApples - 50;
        System.out.println("You have " + totalNumberOfApples + " Apples remaining");
        // the Result is: You have 150 Apples remaining

        System.out.println(100 + "40" + 30 + 20);// The result is: 100403020
        System.out.println(100 + "40" + (30 + 20));//The result is: 1004050

        int number6 = 200;
        System.out.println(number6 - 100); // the result is: 100
        System.out.println(number6); // The result is back: 200
        System.out.println(number6 = number6 - 100);//the result is: 100
        System.out.println(number6); // The result is: 100
        //This process is called keep tracking of your variable value.

    }
}
