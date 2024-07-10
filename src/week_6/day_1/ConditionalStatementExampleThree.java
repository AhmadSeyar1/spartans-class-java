package week_6.day_1;

public class ConditionalStatementExampleThree {
    public static void main(String[] args) {
  /* Question: favorite color picker
  You have two color options: String = "Red": and String color2= "Blue";
  You like the color "Red" more than Blue
  Using the conditional operator, determine which color is your favorite
  Store your favorite color in a variable called favoriteColor
  Print out your favorite color. what is the color?
   */

        String color1 = "Red";
        String color2 = "Blue";

        String favoriteColor; // My Favorite color is Blue.

        favoriteColor = (color1.equals(color2) ? color1 : color2);

//        favoriteColor = ("Red".equals("Blue") ? color2 : color1);// You can do it this way also

        System.out.println("Favorite Color: " + favoriteColor);


    }
}
