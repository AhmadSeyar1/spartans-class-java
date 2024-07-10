package week_11.day_3;

public class StringPractice {
    public static void main(String[] args) {

        String str = "Hello";
        String str2 = "Hello";

        System.out.println(str.hashCode()); // result: 69609650
        System.out.println(str2.hashCode()); // result: 69609650
        // if the string value already exists in the string pool, java will reuse that
        // value and assign its reference to the variable instead of creating a new object.

        String str3 = "Hello"; //String str3 = new String("Hello");
        System.out.println(str3.hashCode());
        
    }


}
