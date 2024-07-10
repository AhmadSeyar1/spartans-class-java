package week_9.day_1;

public class TestMethod {
    public static void main(String[] args) {

        var methodObj = new MethodExample();

        // Access non-Static members
        methodObj.printMenuTwo();
        methodObj.printFullName2();

        // Access Static members
        MethodExample.printFullName();
        MethodExample.printMenu();
    }
}
