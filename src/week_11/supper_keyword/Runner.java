package week_11.supper_keyword;

public class Runner {

    public static void main(String[] args) {
        ClassB classBObj = new ClassB();

        classBObj.firstName = "Johan";

        // Print the value of firstName through the created method
        classBObj.printClassBFirstName();
        classBObj.printClassAFirstName();
        classBObj.printFirstName();

    }
}
