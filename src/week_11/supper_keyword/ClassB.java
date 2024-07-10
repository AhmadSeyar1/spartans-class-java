package week_11.supper_keyword;

public class ClassB extends ClassA {

    String firstName;

    // Constructor
    public ClassB() {
        this.firstName = "";
    }

    // Method to print the value of ClassB
    public void printClassBFirstName() {
        System.out.println(firstName);
    }

    public void printClassAFirstName() {
        System.out.println(super.firstName);
    }

    // Print parent firstName
    public void printFirstName() {
        super.printFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Store the value of firstName from parent class into firstName of class B
    void setValueOfParent() {
        this.firstName = super.firstName;
    }

}
