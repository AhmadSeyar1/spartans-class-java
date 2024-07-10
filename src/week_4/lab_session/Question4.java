package week_4.lab_session;

public class Question4 {
    public static void main(String[] args) {
        //Extract the word "Java" from string "Hello Java World"
        String str = "Hello Java World";
        System.out.println(str.indexOf("Java"));
        System.out.println("Start from: " + str.indexOf("Java"));//Found start index of Java
        System.out.println("End at: " + (str.indexOf("World") - 1));//Found end index of Java
        System.out.println("End at: " + (str.indexOf("Java") + 4));//Also found end index of Java
        System.out.println(str.substring(6, 10));// Output: Java
    }
}
