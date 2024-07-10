package week_8.day_2;

public class StringActivityOne {
    public static void main(String[] args) {
        // String message = "Welcome to TekSchool";

        // 3 words
        String message = "Welcome to TekSchool";
        String[] listOfWords = message.split(" ");
        for (String value : listOfWords) {
            System.out.println(value);
            /*
            Result:
            Welcome
            to
            TekSchool
             */
        }

    }
}
