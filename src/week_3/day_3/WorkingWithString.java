package week_3.day_3;

public class WorkingWithString {
    public static void main(String[] args) {
        String message = "tony";
        System.out.println("4");
        System.out.println(message.length());

        message = "Tony Enjoys Java";
        System.out.println(message.length());

        String fullName = "Ahmad Khan";
        System.out.println(fullName.charAt(2)); // Result is m
        //With charAt() method you can print any letter from your string by using its index number.
        System.out.println(fullName.charAt(0)); // result is 0
        System.out.println(fullName.length() - 1);// Result is 9 the last index number

        //Now if you want to print the last character of your message
        System.out.println(fullName.charAt(fullName.length() - 1));// Result is last character -n-


    }
}
