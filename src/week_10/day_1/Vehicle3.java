package week_10.day_1;

public class Vehicle3 {

    // Variables
    String comName;
    String model;
    String trim;
    int numOfDoors;

    public Vehicle3(String comName, String model, String trim, int numOfDoors) {
        setComName(comName);
        setModel(model);
        setTrim(trim);
        setNumOfDoors(numOfDoors);

    }

    // Getters and Setters
    private String getComName() {
        return comName;
    }

    private void setComName(String comName) {
        this.comName = comName;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        model = model;
    }

    private String getTrim() {
        return trim;
    }

    private void setTrim(String trim) {
        this.trim = trim;
    }

    private int getNumOfDoors() {
        return numOfDoors;
    }

    private void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    // Public Method
    public void printVehicleInfo() {
        System.out.println("* * * Vehicle Info * * *");
        System.out.println("Vehicle Company: " + comName);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Trim: " + trim);
        System.out.println("Vehicle Doors: " + numOfDoors);
    }

}



