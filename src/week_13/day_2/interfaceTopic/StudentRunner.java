package week_13.day_2.interfaceTopic;

public class StudentRunner {
    public static void main(String[] args) {
        var studentOne = new Student(
                "John",
                "Khan",
                "01/04/1980");
        studentOne.printStudentInfo();
    }
}
