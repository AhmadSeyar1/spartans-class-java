package week_7.day_2;

public class TwoDimensionArrayUsingStaticInitialization {
    public static void main(String[] args) {

        // Static Initialization of 2D Array
        int[][] numbers = {{10, 20, 30}, {40, 50, 60}};

        System.out.println(numbers[0][0]); // 10
        System.out.println(numbers[0][1]); // 20
        System.out.println(numbers[0][2]); // 30
        System.out.println(numbers[1][0]); // 40
        System.out.println(numbers[1][1]); // 50
        System.out.println(numbers[1][2]); // 60

        String[][] studentNames = {
                {"Bob", "Eric"},
                {"John", "Erin", "Doe"},
                {"Mathias"}
        };
        System.out.println(studentNames[0][0]);
        System.out.println(studentNames[0][1]);
        
        System.out.println(studentNames[1][0]);
        System.out.println(studentNames[1][1]);
        System.out.println(studentNames[1][2]);

        System.out.println(studentNames[2][0]);


    }
}
