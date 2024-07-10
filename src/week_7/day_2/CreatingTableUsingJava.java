package week_7.day_2;

public class CreatingTableUsingJava {
    public static void main(String[] args) {

        // Creating table using Java
        //What is table?
        //Rows and Columns

        String[] names = {"John", "Eric", "Tony"}; // One Dimension Array
        String[][] studentNames = new String[2][3]; /// Two Dimension Array
        // Max row --> n - 1 --> 2 - 1 = 1
        // Max Col --> n - 1 --> 3 - 1 = 2

        // First row
        studentNames[0][0] = "Bob";
        studentNames[0][1] = "Doe";
        studentNames[0][2] = "John";

        // Second Row
        studentNames[1][0] = "Tony";
        studentNames[1][1] = "Max";
        studentNames[1][2] = "Eric";

        // Print values
        System.out.println(studentNames[0][0]);
        System.out.println(studentNames[0][1]);
        System.out.println(studentNames[0][2]);

        System.out.println(studentNames[1][0]);
        System.out.println(studentNames[1][1]);
        System.out.println(studentNames[1][2]);

    }
}
