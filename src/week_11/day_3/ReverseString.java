package week_11.day_3;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello World";
        printReverseString(str);
    }

    public static void printReverseString(String str) {
        String reverseVersion = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            reverseVersion += str.charAt(index);
        }
        System.out.println("Reverse Version of " + str + " is = " + reverseVersion);
        // Result: Reverse Version of Hello World is = dlroW olleH
    }
}
