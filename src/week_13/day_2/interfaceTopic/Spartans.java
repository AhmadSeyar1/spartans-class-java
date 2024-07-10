package week_13.day_2.interfaceTopic;

public interface Spartans {

    // Fields
    //Fields in interface are by default final, so regardless of mentioning the final keyword.
    // fields or variables are going to be final in interface.
    String className = "Spartans";
    String teacherName = "Yousuf";
    String startDate = "02/05/2024";
    String endDate = "12/30/2024";

    void printStudentInfo();

}
