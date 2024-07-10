package week_8.day_1;

public class WhileLoopActivity1 {
    public static void main(String[] args) {
        String[] studentNames = {"Ahmad", "Khan", "Tony", "John", "Bob"};
        // Initialization
        int index = 0;

        //Condition
        //If you want to print only one name
        while (index < studentNames.length) {
            if (studentNames[index].equals("Khan"))
                System.out.println(studentNames[index]);//Result: Khan

            // Iteration
            index++;
        }
    }
}
