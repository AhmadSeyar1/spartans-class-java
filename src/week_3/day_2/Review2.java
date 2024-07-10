package week_3.day_2;

public class Review2 {
    //Static variable can be access from entire class
    //No need to create object like instance variable
    // it is also called class level variable
    static String middleName;
    static int phoneNumber;

    public static void main(String[] args) {

        String firstName = "Ahmad"; // This is local variable
        //Local variables are used only inside the method no where else.
        System.out.println(firstName);

        System.out.println(middleName);
        System.out.println(phoneNumber);

    }
}
