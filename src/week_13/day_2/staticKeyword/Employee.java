package week_13.day_2.staticKeyword;

public class Employee {


    public static int countEmployee = 0;
    private String firstName;
    private int age;

    // Constructor


    public Employee(String firstName, int age) {
        setFirstName(firstName);
        setAge(age);
        countEmployee++;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
