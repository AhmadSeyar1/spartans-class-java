package week_4.day_3;

public class MixedTypes {
    public static void main(String[] args) {
        // int + float:

        int a = 5;
        float b = 2.5f;
        float result = a + b; //'a' is promoted to float for this operation
        System.out.println(result);// Output: 7.5

        //Long + double:

        long c = 10L;
        double d = 5.5;
        double result2 = c + d;// 'c' is promoted to double for this operation
        System.out.println(result2);// Output: 15.5
    }
}
