package week_11.day_3;

public class MutableString {

    /*
    We have two types of MutableString

    1. StringBuilder: You can modify its contents without creating a new object.

    2. StringBuffer:

     */

    public static void main(String[] args) {
        // Create an object of String
        var string = ""; //Immutable String--> Not changeable

        //Create an object of StringBuilder
        // How to insert value to StringBuilder
        //insert()--> Add value to StringBuilder
        //nameOfYourStringBuilder.insert(" value");
//        stringBuilder.insert("Hello World");

        // Print value of StringBuilder

        System.out.println(// Mutable String-->Changeable
                "Hello World");

        //Create an object of StringBuffer
        var stringBuffer = new StringBuffer();//
    }


}
