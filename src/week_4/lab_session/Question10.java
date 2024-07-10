package week_4.lab_session;

public class Question10 {
    public static void main(String[] args) {
        // Give the string "flood door", write a Java program that replaces all
        //occurrences of the letter 'o' with the letter 'e', print the modified string
        // Expected output: fleed deer
        String str = "flood door";
        str = str.replaceAll("o", "e");
        System.out.println(str); // Output: fleed deer
    }
}
