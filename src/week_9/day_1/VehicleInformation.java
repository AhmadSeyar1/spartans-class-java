package week_9.day_1;

public class VehicleInformation {
    String vehicleCompany;
    String vehicleModel;
    String vehicleTrim;
    int vehicleNumberOfDoors = 4;
    int vehicleYear = 2024;

    //Print the BMW Information
    public void printVehicleInformation() {
        System.out.println("Company Name: " + vehicleCompany);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Vehicle Trim: " + vehicleTrim);
        System.out.println("Vehicle number of doors: " + vehicleNumberOfDoors);
        System.out.println("Vehicle Year: " + vehicleYear);

    }
}
