package week_4.day_2;

public class IndexOfMethod {
    public static void main(String[] args) {
        //IndexOf(): Method returns the index of specific character
        String message = "welcome to TekSchool spartans students!";
        // charAt()
        System.out.println(message.charAt(0));// w
        System.out.println(message.charAt(4));// o

        // indexOf()
        System.out.println(message.indexOf('w'));// 0
        System.out.println(message.indexOf('o')); // 4
        //Note: if there is multiple same character, it will give you the first one.
        System.out.println(message.indexOf('!'));// 20
        System.out.println(message.indexOf("welcome"));// 0
        //It is 0 because it will start from the first letter.
        System.out.println(message.indexOf("students"));// 30
       
    }
}
