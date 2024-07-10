package week_7.day_1;

public class EmployeeActivityThree {
    public static void main(String[] args) {

        String[] employeeFirstNames = {"Bob", "Tony", "Eric", "Erin", "John"};
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (String names : employeeFirstNames) {
            System.out.println(names);
            for (int num : numbers)
                System.out.println(num);
        }
    }
}
