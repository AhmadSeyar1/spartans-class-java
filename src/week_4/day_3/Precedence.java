package week_4.day_3;

public class Precedence {
    public static void main(String[] args) {
        int inValue = 10;
        double doubleValue = 15.5;
        String message = "Welcome Student!";

        double speed = 130;

        System.out.println(inValue);
        System.out.println(doubleValue);
        System.out.println(message);
        System.out.println(speed);

        System.out.println("the result of calculation is : " + inValue + doubleValue);
        //Result: the result of calculation is : 1015.5
        System.out.println("the result of calculation is : " + (inValue + doubleValue));
        //Now the Result is:  25.5
        //here the parentheses are the precedence
        System.out.println("Your speed is: " + speed);//Result: Your speed is: 130.0

        //3+3+10=16
        System.out.println(3 + 3 + 10); //16

        //10+10+10*5 = 70
        //10+10+50
        //70
        System.out.println(10 + 10 + 10 * 5); // 70

        //5+5(2+3)*5 = 130
        //5+5*5*5
        //5+25*5
        //5+125
        //130
        System.out.println(5 + 5 * (2 + 3) * 5);//130

        // 5*2+1(1*0)+5*1*0+1 = 11
        //5*2+1*0+5*1*0+1
        //10+1*0+5*1*0+1
        //10+0+5*0+1
        //10+0+0+1 = 11
        System.out.println(5 * 2 + 1);//11

        // [(5+2)*2] + [(1*0)*0+1] = 15
        //[7*2] + [1]
        //14+1 = 15
        System.out.println(((5 + 2) * 2) + (1));//15


    }
}
