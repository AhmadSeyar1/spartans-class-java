package week_10.day_2;

public class GettersPractice {

    private String firstName;
    private String lastName;

    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    // Create a method to give us the values of private variables.
    // Getters and Setters are both methods
    // Access Modifier, Return type, nameOfMethod (){}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
