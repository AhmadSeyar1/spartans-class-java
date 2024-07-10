package week_11.day_1;

public class Runner {
    public static void main(String[] args) {

        // Object of Student Class
        Student stdObj = new Student(
                "Johan",
                "Doe",
                "California",
                "A101",
                "12/25/2012",
                "programming",
                'A');

        // Print Student Information
        stdObj.printStudentInfo();
       
    }
}
