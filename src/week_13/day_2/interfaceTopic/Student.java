package week_13.day_2.interfaceTopic;

public class Student implements Spartans {

    // Fields
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    //Constructor


    public Student(String firstName, String lastName, String dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }

    // Getters and Setters
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

    @Override
    public void printStudentInfo() {
        System.out.println("firstName: " + getFirstName());
        System.out.println("lastName: " + getLastName());
        System.out.println("date of Birth: " + getDateOfBirth());

        System.out.println("Class Name: " + className);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

    }
}
