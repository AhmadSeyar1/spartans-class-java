package week_3.day_2;

public class Review {
    //Instance Variable:
    String middleName;
    // this is instance variable or object variable.
    //If you want to access instance variable you have to create object
    //It belongs to the object of the class Review.
    // Instance variables can be accessed in entire project.
    int phoneNumber;

    public static void main(String[] args) {
        Review obj = new Review(); // this is the instance or object of the class Review.
        obj.middleName = "Khan";
        obj.phoneNumber = 916666555;

        System.out.println(obj.middleName);
        System.out.println(obj.phoneNumber);


    }
}
