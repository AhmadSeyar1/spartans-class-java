package week_13.day_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFile {

    public static void main(String[] args) {

        String[] students = {"Bob", "Khan", "Tom", "Jack", "Tony"};
        int count = 1;

        try {
            var writer = new BufferedWriter(new FileWriter("studentNames.txt"));
            for (String studentName : students) {
                writer.write(count + ". " + studentName + '\n');
                count++;
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("A message");
        }
    }
     /*
        This will copy name of the students in an external file.
        After you run this then go to project at the very end you can
        see the name of this file if you click on that you can see
        the copy of student names. Also if you go to the project folder in
        your computer you can see the file name with student names on it.
         */
}
