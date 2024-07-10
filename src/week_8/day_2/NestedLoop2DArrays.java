package week_8.day_2;

public class NestedLoop2DArrays {
    public static void main(String[] args) {
        String[][] studentNames = {
                {"Ahmad", "Khan", "John"},
                {"Bob", "Eric", "Alex"},
                {"Hamid", "Satar"}
        };
        for (int row = 0; row < studentNames.length; row++) { // Outer Loop
            for (int col = 0; col < studentNames[row].length; col++) { // inner loop
                System.out.print(studentNames[row][col] + " ");
            }
            System.out.println();
            /*Result:
            Ahmad Khan John
            Bob Eric Alex
            Hamid Satar

             */

        }


    }
}
