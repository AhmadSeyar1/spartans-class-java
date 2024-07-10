package week_7.day_1;

public class StaticArrayInitializationActivityOne {
    public static void main(String[] args) {

        String empOneFirstName = "Bob";
        String empTwoFirstName = "Tony";
        String empThreeFirstName = "Eric";
        String empFourFirstName = "Erin";
        String empFiveFirstName = "John";

        String[] employeeFirstNames = new String[5];
        employeeFirstNames[0] = "Bob";
        employeeFirstNames[1] = "Tony";
        employeeFirstNames[2] = "Eric";
        employeeFirstNames[3] = "Erin";
        employeeFirstNames[4] = "John";

        System.out.println(employeeFirstNames[0]);
        System.out.println(employeeFirstNames[1]);
        System.out.println(employeeFirstNames[2]);
        System.out.println(employeeFirstNames[3]);
        System.out.println(employeeFirstNames[4]);
    }
}
