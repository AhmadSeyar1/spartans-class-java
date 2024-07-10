package week_4.lab_session;

public class Question9 {
    public static void main(String[] args) {
        //Replace all the occurrences of 'a' with '@' in the string "Java Basics".
        //Expected Output: J@v@ B@sics
        String str = "Java Basics";
        System.out.println(str.replaceAll("a", "@"));// J@v@ B@sics

        //You can also modify this string from Java Basics to B@v@ B@sics
        System.out.println(str);// Outcome: Java Basics
        str = str.replaceAll("a", "@");
        System.out.println(str); // J@v@ B@sics
    }
}
