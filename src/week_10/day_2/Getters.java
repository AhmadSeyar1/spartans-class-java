package week_10.day_2;

public class Getters {
    public static void main(String[] args) {

        printMessage();
        printFirstName("Ahmad");
        printFirstName("Khan");

        //Now anywhere in your project whenever you want to print this message
        //You don't need to re-write the same code and waste your time, you need to
        //just call the printMessage method. This is the purpose of methods

        var getterObj = new GettersPractice();
        // Get the value of first Name --> It is private in GetterPractice class
        // Get the value of last Name --> It is private in GetterPractice class

        getterObj.setFirstName("Ahmad");
        getterObj.setLastName("Samadi");
        
        System.out.println(getterObj.getFirstName());
        System.out.println(getterObj.getLastName());

    }


    //Methods
    // Access Modifier, Return type, nameOfMethod (){}
    public static void printMessage() {
        System.out.println("Welcome to TekSchool!");
    }

    public static void printFirstName(String firstName) {
        System.out.println("First Name: " + firstName);
    }
}
