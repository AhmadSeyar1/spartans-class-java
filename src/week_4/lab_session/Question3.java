package week_4.lab_session;

public class Question3 {
    public static void main(String[] args) {
        int countCharacters = 0;
        //Remove the spaces and print the length
        // First Solution
        String sentence = "How many letters are in this sentence?";
        System.out.println(sentence.length());
        System.out.println(sentence.replaceAll(" ", "").length());// 32

        // Second Solution
        sentence = sentence.replaceAll(" ", "");
        System.out.println(sentence.length());

        // Third Solution
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ') { // != not equal sign (! =)
                countCharacters++;
            }

        }
        System.out.println("Character length: " + countCharacters);// Character length: 32

    }
}
