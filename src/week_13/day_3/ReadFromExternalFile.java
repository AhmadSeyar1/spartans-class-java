package week_13.day_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromExternalFile {

    public static void main(String[] args) {
        // It gives us the ability to read something from external source.

        try {
            var reader = new BufferedReader(new FileReader("studentNames.txt"));
            String value;

            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IIOException");
        }


    }


}
