package week_11.day_3;

public class StringPracticeTwo {
    public static void main(String[] args) {
        // Fields
        String str1 = "Hello";// "Hello" --> String Litteral -->Stored in String pool-->Heap
        System.out.println(str1.hashCode());// 69609650

        String str2 = "Hello";
        System.out.println(str2.hashCode());// 69609650

        str1 = "World";
        System.out.println(str1.hashCode());// 83766130

        str2 = "Zia";
        System.out.println(str2.hashCode());// 89842
    }
}
