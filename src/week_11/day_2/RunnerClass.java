package week_11.day_2;

public class RunnerClass {
    public static void main(String[] args) {

        // Create object of car
        Car carObj = new Car();

        // Create Object of MotorCycle
        Motorcycle MotorCycleObj = new Motorcycle();

        carObj.StartEngine();
        carObj.StopEngine();
        carObj.playRadio();

        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        MotorCycleObj.StartEngine();
        MotorCycleObj.StopEngine();
        MotorCycleObj.popWheelie();


    }
}
