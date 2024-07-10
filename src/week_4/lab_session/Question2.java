package week_4.lab_session;

public class Question2 {
    public static void main(String[] args) {
        String str = "java";
        String str1 = "script";
        String str2 = str + str1;
        System.out.println(str + str1);//javascript
        System.out.println(str2.length()); // 10
        //other solution:
        System.out.println((str + str1).length());// 10
    }
}
