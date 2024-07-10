package week_11.day_1;

public class Student extends Employee {

    // Unique Properties
    private String studentID;
    private String graduationDate;
    private String subject;
    private char grade;

    // Constructor (parameterized constructor because in parent class the constructor
    // is parameterized.
    public Student(
            String firstName,
            String lastName,
            String address,
            String studentID,
            String graduationDate,
            String subject,
            char grade) {
        super(firstName, lastName, address);
        setStudentID(studentID);
        setGraduationDate(graduationDate);
        setSubject(subject);
        setGrade(grade);
    }

    // Getters and Setters


    private String getStudentID() {
        return studentID;
    }

    private void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    private String getGraduationDate() {
        return graduationDate;
    }

    private void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    private String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    private char getGrade() {
        return grade;
    }

    private void setGrade(char grade) {
        this.grade = grade;
    }

    // Method to print Student Information
    public void printStudentInfo() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Subject: " + getSubject());
        System.out.println("Grade: " + getGrade());

    }
}
