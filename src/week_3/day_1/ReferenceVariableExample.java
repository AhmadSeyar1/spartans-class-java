package week_3.day_1;

public class ReferenceVariableExample {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Tony";
        // Reference code for both: 2612646, but they are not duplicate
        // the above hashcode is the reference of Tony.
        System.out.println(firstName.hashCode());
        System.out.println("***********");

        System.out.println(lastName.hashCode());
        System.out.println("***********");

        firstName = "Eric";
        System.out.println(firstName.hashCode());
        System.out.println("***********");
        //2168487 -> now this hashcode is the reference of Eric

        lastName = "Alexander";
        System.out.println(lastName.hashCode());
        //696546630 -> now this hashcode is the reference of Eric
    }
}
