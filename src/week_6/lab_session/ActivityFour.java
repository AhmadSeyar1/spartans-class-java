package week_6.lab_session;

public class ActivityFour {
    public static void main(String[] args) {
   /*
   Age Group Classification
   Objective: Classification individuals into age groups based on their age.
   You are designed a system that categorized individuals into age groups:
   * Child (0-12)
   * Teenager (13 - 19)
   * and Adult (20 and above)
   A user provides their age: int userAge = 15; (This value can be changed for testing)
   Determine th user's age group.
   Print out the age group of the user.
    */
        int userAge = 28;

        if (userAge > 0) {
            if (userAge <= 12) System.out.println("Child (0-12)");
            else if (userAge <= 19) System.out.println("Teenager (13-19");
            else System.out.println("Adult (20 and above)");
        } else {
            System.out.println("Invalid Entry");
        }

        {

        }
    }
}
