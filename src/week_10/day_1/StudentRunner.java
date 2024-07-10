package week_10.day_1;

public class StudentRunner {
    public static void main(String[] args) {

        // AAA --> Arrange, Act, Assert

        // Arrange
        // Create Object
        Student stdObjOne = new Student(10, "Ahmad", "Khan", "01/03/1985");// Student one Object
        Student stdObjTwo = new Student(15, "John", "Toyson", "02/05/1987");// Student two Object
        // Note: In above you can add values first add quotation marks then press enter and add the values.
        // Assign the values of variables

        // Action: --> Print the information of first Student
        stdObjOne.printStudentInfo();

        // Action: --> Print the information of second Student
        stdObjTwo.printStudentInfo();


    }
}
