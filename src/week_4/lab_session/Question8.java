package week_4.lab_session;

public class Question8 {
    public static void main(String[] args) {
        //Give the string "Learning Java is fun", write a Java program to find and
        //print the character that appears exactly at the middle of the string.
        String str = "Learning Java is fun";
        System.out.println(str.length() / 2 - 1);// outcome: 10-1=9
        System.out.println(str.charAt(9));// outcome: J

        //Other solution:
        int middleIndex = (str.length() / 2) - 1;
        System.out.println(middleIndex);// outcome: 9
        char middleCharacter = str.charAt(middleIndex);
        System.out.println("Middle index is: " + middleIndex); // Outcome: 9
        System.out.println("Middle character is: " + middleCharacter);//Outcome: J

        //Easy Solution:
        System.out.println(str.charAt((str.length() / 2) - 1));//Outcome: J

    }
}
