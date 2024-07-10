package week_7.day_3;

public class Test {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(numbers[1][2]);//6
        System.out.println(numbers[0][1]);//2
        

        int[][] numbersTwo = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {3}
        };
        System.out.println(numbersTwo[1][0]);
        System.out.println(numbersTwo[0][6]);
        System.out.println(numbersTwo[0][numbersTwo[0].length - 1]);
        System.out.println(numbersTwo[0][numbersTwo[0].length / 2 - 1]);//middle index

    }
}
