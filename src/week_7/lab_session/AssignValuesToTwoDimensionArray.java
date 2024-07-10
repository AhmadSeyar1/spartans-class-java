package week_7.lab_session;

public class AssignValuesToTwoDimensionArray {
    public static void main(String[] args) {
        String[] message = {"Welcome ", "to TekSchool", " and", " Java", " is", " easy", " to", " lean"};

        // Print the elements of message array
        /*
         for (initialization; condition; iteration;)
         */
        for (int index = 0; index < message.length; index++) {
            System.out.print(message[index]);
            //Result: Welcome to TekSchool and Java is easy to lean
        }
    }
}
