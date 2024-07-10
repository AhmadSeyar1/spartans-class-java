package week_4.day_1;

public class ReplaceActivity {
    public static void main(String[] args) {
        //Given a String firstName = "Alexander Morphy"
        //1. Replace "Alexander" with "Erin"
        //2. Replace "Morphy" with "Curreto"
        //3. Replace "Erin Curreto" with "John Doe"
        //4. Remove the space between "John" and "Doe"--> Expected Result should be JohnDoe
        //5. Print the length firstName.

        String firstName = "Alexander Morphy";
        System.out.println(firstName);
        firstName = firstName.replace("Alexander", "Erin");
        System.out.println(firstName);
        firstName = firstName.replace("Morphy", "Curreto");
        System.out.println(firstName);
        firstName = firstName.replace("Erin Curreto", "John Doe");
        System.out.println(firstName);
        firstName = firstName.replaceAll(" ", "");
        System.out.println(firstName);
        System.out.println(firstName.length());


    }
}
