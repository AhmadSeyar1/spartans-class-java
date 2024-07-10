package week_8.day_3;

public class NestedForLoopEx2 {
    public static void main(String[] args) {

        // 2D Array of size 3 which means 3x3
        /*
        Row [0]  column [0]
        Row [0]  column [1]
        Row [0]  column [2]

        Row [1]  column [0]
        Row [1]  column [1]
        Row [1]  column [2]

        Row [2]  column [0]
        Row [2]  column [1]
        Row [2]  column [2]

        COLUMNS->  0        1       2
        Row 0 { "Ahmad", "Nabi", "Khan"},
        Row 1 { "Shah", "Tony", "Javad"},
        Row 2 { "Bob", "John", "Eric"},
         */

        String[][] studentsNames = {
                {"Ahmad", "Nabi", "Khan"},
                {"Shah", "Tony", "Javad"},
                {"Bob", "John", "Eric",},
        };

        for (int row = 0; row < studentsNames.length; row++) { // Outer Loop starts
            for (int col = 0; col < studentsNames[row].length; col++) { // Inner Loop starts
                System.out.println(" Row [ " + row + " ] Column [ " + col + " ] + " + studentsNames[row][col]);
            } // End of Inner Loop

            // Jump into new line
            System.out.println();
        }
        /*
        Result:
        Row [ 0 ] Column [ 0 ] + Ahmad
        Row [ 0 ] Column [ 1 ] + Nabi
        Row [ 0 ] Column [ 2 ] + Khan

        Row [ 1 ] Column [ 0 ] + Shah
        Row [ 1 ] Column [ 1 ] + Tony
        Row [ 1 ] Column [ 2 ] + Javad

        Row [ 2 ] Column [ 0 ] + Bob
        Row [ 2 ] Column [ 1 ] + John
        Row [ 2 ] Column [ 2 ] + Eric
         */
    }
}
