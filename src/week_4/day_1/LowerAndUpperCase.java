package week_4.day_1;

import java.util.Locale;

public class LowerAndUpperCase {
    public static void main(String[] args) {
        String fullName = "Ahmad Khan";
        System.out.println(fullName);//result: Ahmad Khan
        System.out.println(fullName.toUpperCase(Locale.ROOT));//result: AHMAD KHAN
        System.out.println(fullName.toLowerCase(Locale.ROOT));//result: ahmad khan
        System.out.println(fullName);//Result: Ahmad Khan
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println(fullName);//Now the result is AHMAD KHAN
    }
}
