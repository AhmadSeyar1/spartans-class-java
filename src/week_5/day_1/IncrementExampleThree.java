package week_5.day_1;

public class IncrementExampleThree {
    public static void main(String[] args) {

        for (int number = 1; number <= 50; number++) {
            System.out.println(number);
        }
        int num = 56;
        System.out.println(num++);//56
        System.out.println(num++);//57

        System.out.println(++num);//59
        System.out.println(++num);//60

        int num2 = 66;

        System.out.println(num2--);//66
        System.out.println(num2--);//65

        System.out.println(--num2);//63
        System.out.println(--num2);//62


    }
}
