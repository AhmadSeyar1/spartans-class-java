package week_11.day_1;

public class Employee {

    // Attributes --> Variables --> Fields = all are same
    private String firstName;
    private String lastName;
    private String address;
    // Unique Properties
    private double salary;
    private String startDate;
    private String endDate;
    private String position;

    // Constructor
    public Employee(String firstName, String lastName, String address) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
    }

    // Functions / Methods
    private void printEmployeeInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
    }
    //Getter and Setters


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Getters and Setters for Unique Properties

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    private String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    private String getEndDate() {
        return endDate;
    }

    private void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    private String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;
    }
}
