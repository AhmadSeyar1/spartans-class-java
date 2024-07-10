package week_4.lab_session;

public class Question6 {
    public static void main(String[] args) {
        //Extract the word "boot" from the string "bootcamp" using the substring method
        String str = "bootcamp";
        System.out.println("Start index: " + str.indexOf("b"));
        System.out.println("End index: " + str.indexOf("t"));
        System.out.println(str.substring(0, 4)); // 0+4-1=3 --> Outcome: boot
        //other solution:
        System.out.println(str.substring(0, str.indexOf("boot") + 4));//outcome: boot
        System.out.println(str);  // outcome: bootcamp --> because we didn't modify it.
        str = str.substring(0, 4);// We modify it
        System.out.println(str); // outcome: boot
    }
}
