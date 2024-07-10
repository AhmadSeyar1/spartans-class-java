package week_4.day_1;

public class SubStringMethod {
    public static void main(String[] args) {

        String fullName = "Eric Morphy";
        System.out.println(fullName);
        System.out.println(fullName.substring(0, 11));
        System.out.println(fullName.substring(7)); //Result: rphy = Will start printing from index 7
        System.out.println(fullName.substring(0, 3));//Result is Eri
        //endIndex is exclusive. which means if you pass 3, it is going to be 2. since 3-1=2
        //If you want to print complete Eric then pass 0 to 4 which will 4-1=3
        System.out.println(fullName.substring(0, 4)); // Now result is Eric
        
    }
}
