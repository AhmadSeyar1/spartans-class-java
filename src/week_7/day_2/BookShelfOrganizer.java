package week_7.day_2;

import java.util.Scanner;

public class BookShelfOrganizer {
    public static void main(String[] args) {
        /*
        Objective: Store a collection of book titles and retrieve a book by its position on th shelf.

        Steps:
        Declare a 10 array to hold a certain number of book titles.
        Assign a book title to each position in th array.
        To find the title of the book that's 3rd from the left, access the element at index 2.
        Print the book title retrieved from the array.
         */

        String[] bookTitles = new String[4];
        bookTitles[0] = "a";
        bookTitles[1] = "b";
        bookTitles[2] = "c";
        bookTitles[3] = "d";
        System.out.println("third book from lelft " + bookTitles[2]);

        // Use Scanner
        String[] bookTitles2 = new String[4];
        var scnObj = new Scanner(System.in);

        System.out.print("Enter the first book title: ");
        bookTitles2[0] = scnObj.next();
        System.out.print("Enter the second book title: ");
        bookTitles2[1] = scnObj.next();
        System.out.print("Enter the third book title: ");
        bookTitles2[2] = scnObj.next();
        System.out.print("Enter the fourth book title: ");
        bookTitles2[3] = scnObj.next();

        System.out.println("third book from left: " + bookTitles2[2]);
    }
}
