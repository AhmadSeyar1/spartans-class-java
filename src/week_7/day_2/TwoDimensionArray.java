package week_7.day_2;

public class TwoDimensionArray {
    public static void main(String[] args) {

        // Dynamic Initialization of 2D Array
        int[][] numbers = new int[2][2];

        //Max Rows that I can Assign value: 2-1 = 1
        //Max Columns that I can Assign value: 2-1 = 1

        numbers[0][0] = 10;
        numbers[0][1] = 50;
        numbers[1][0] = 40;
        numbers[1][1] = 30;

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);


    }
}
