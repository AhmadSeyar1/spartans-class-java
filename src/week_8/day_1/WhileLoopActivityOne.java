package week_8.day_1;

public class WhileLoopActivityOne {
    public static void main(String[] args) {

        String[] studentNames = {"Ahmad", "Khan", "Tony", "John", "Bob"};
        // Initialization
        int index = 0;

        //Condition
        while (index < studentNames.length) {
            System.out.println(studentNames[index]);

            // Iteration
            index++;
            
        }
    }
}
