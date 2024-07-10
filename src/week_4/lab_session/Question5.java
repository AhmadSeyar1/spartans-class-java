package week_4.lab_session;

public class Question5 {
    public static void main(String[] args) {
        //Extract and print the substring starting from index 3 up to the end of the string
        String str = "Programming";
        System.out.println(str.substring(3));//Outcome: gramming
        String message = str.substring(3);
        System.out.println(message); //Outcome: gramming
        str = str.substring(3);
        System.out.println(str); //Outcome: gramming
    }
}
