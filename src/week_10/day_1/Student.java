package week_10.day_1;

public class Student {

    // Variables
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    //Methods

    // Getter & Setters
    /*
    We create getters to get access the private properties outside the same class.
    Getters and setters are methods nothing else.
     */

    /*
    There is a shortcut to generate getter and setter
    -> right click anywhere on the window-> got to generate-> Now you  have getter and setter
    Or you can generate both getters and setter together.

     */

    // Constructor
    //Note: to generate constructor: right click->select generate->select constructor->
    //->select all of them->click Ok.
    public Student(int id, String firstName, String lastName, String dateOfBirth) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);

    }

    // Getters and Setters
    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void printStudentInfo() {
        System.out.println("* * * * Student Information * * * *");
        System.out.println("id: " + getId());
        System.out.println("firstName: " + getFirstName());
        System.out.println("lastName: " + getLastName());
        System.out.println("dat of birth: " + getDateOfBirth());
    }
}

