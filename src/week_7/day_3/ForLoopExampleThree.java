package week_7.day_3;

public class ForLoopExampleThree {
    public static void main(String[] args) {
        // Given one dimension of string
        String[] names = {"Ahmad", "John", "Doe", "Alex", "Eric", "Eric"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
