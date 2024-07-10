package week_6.day_1;

public class Review {
    public static void main(String[] args) {
        String className = "Spartans";

        // if statement
        if (className.equals("Spartans")) {
            System.out.println("Welcome Spartans");
        }

        // Switch statement
        switch (className) {
            case "Spartans":
                System.out.println("Welcome Spartans");
                break;
            case "Titans":
                System.out.println("Welcome titans");
                break;
            default:
                System.out.println("your class name is not Spartans or Titans");
        }
    }
}
