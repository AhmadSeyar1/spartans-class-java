package week_4.day_1;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message = "Hello World";
        message = message.replace("Hello", "Welcome");
        //When you put  quotation marks the target: and replacement will automatically come
        System.out.println(message);

        String name = "hello Sir";
        System.out.println(name.replace("hello", "salam"));//Result: salam Sir
        System.out.println(name); //Result is hello Sir
        name = name.replace("Sir", "Mom");
        System.out.println(name);//Result is hello mom.

        // removing spaces from your text.

        String message1 = "Hello brother how are your?";
        System.out.println(message1);//Result: Hello brother how are your?
        System.out.println(message1.replaceAll(" ", ""));
        //Result: Hellobrotherhowareyour?
        //Replaced all the spaces with no spaces.

    }
}
