package week_13.day_2.staticKeyword;

public class Runner {

    public static void main(String[] args) {

        var firstWorker = new WorkShop();
        var secondWorker = new WorkShop();

        var employeeOne = new Employee("John", 31);
        var employeeTwo = new Employee("Ahmad", 25);
        var employeeThree = new Employee("Khan", 29);

        System.out.println(WorkShop.toolBox);

        System.out.println("Count Employees: " + Employee.countEmployee);


    }
}
