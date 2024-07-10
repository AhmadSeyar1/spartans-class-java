package week_6.day_1;

public class ConditionalStatementExampleTwo {
    public static void main(String[] args) {

        int marks = 89;
        char grade;
        grade = (marks >= 90 && marks <= 100) ? 'A' : 'B';

        System.out.println("Grade: " + grade);
    }
}
