package week_6.day_2;

public class NotLogicalOperator {
    public static void main(String[] args) {
 /*
 Imagine you have boolean variables: isWeekend and isHoliday.
 on weekends or holidays, you prefer to sleep in, so you set your alarm to off.
 Otherwise, on weekdays that aren't holidays, you set your alarm to on.
 Set any initial values for inWeekend and isHoliday.
 Determine the state of the alarm based on the values.
  */
        boolean isWeekend, isHoliday;


        //Extra example

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.equals(lastName));// false;

        // Return true if they are not equal
        System.out.println(!firstName.equals(lastName));// true;
    }
}
