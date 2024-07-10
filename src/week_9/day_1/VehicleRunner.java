package week_9.day_1;

public class VehicleRunner {
    public static void main(String[] args) {
        VehicleInformation vehicleInfoObj = new VehicleInformation();
        vehicleInfoObj.vehicleCompany = "Toyota";
        vehicleInfoObj.vehicleModel = "Corolla";
        vehicleInfoObj.vehicleTrim = "??";
        vehicleInfoObj.vehicleNumberOfDoors = 4;
        vehicleInfoObj.vehicleYear = 2024;
        vehicleInfoObj.printVehicleInformation();

        VehicleInformation vehicleInfoBMW = new VehicleInformation();
        vehicleInfoBMW.vehicleCompany = "MBW";
        vehicleInfoBMW.vehicleModel = "X7";
        vehicleInfoBMW.vehicleTrim = "M60i";
        vehicleInfoBMW.vehicleNumberOfDoors = 4;
        vehicleInfoBMW.vehicleYear = 2024;
        vehicleInfoBMW.printVehicleInformation();


    }
}
