package week_8.day_2;

public class NestedLoopActivityThree {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
            /*
             *
             * *
             * * *
             * * * *
             * * * * *
             * * * * * *
             */
        }
        for (int row = 6; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *
         */
    }
}
