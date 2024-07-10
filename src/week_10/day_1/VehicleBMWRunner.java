package week_10.day_1;

public class VehicleBMWRunner {
    public static void main(String[] args) {

        var bmwObj = new BMW();
        bmwObj.printMessage();

        bmwObj.companyName = "BMW";
        bmwObj.trim = "X7";

        System.out.println(bmwObj.companyName);
        System.out.println(bmwObj.trim);

        bmwObj.startEngine();
        bmwObj.stopEngine();
    }
    // Note:
    /*
    Here we had three classes 1. VehicleCategory, 2. BMW, 3. VehicleBMWRunner
    BMW extends VehicleCategory class and in VehicleBMWRunner class we created the
    object of BMW class. It means that in VehicleBMWRunner class we got access to
    the properties of both other classes. It is called single inheritance. You don't have
    to re-write the same code just re-suse them. Inheritance giving us the ability
    that how can we access the property of another class and re-use them again
     */
}
