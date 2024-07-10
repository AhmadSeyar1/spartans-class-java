package week_15.day_1;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithLinkedListImplementation {

    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();
        String[] words = {"Spartans", "TekSchool", "Java", "selenium", "Automation"};

        // Add elements
        for (String word : words) {
            stack.push(word);
        }
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.peekFirst());
        System.out.println(stack.peekLast());

        // Remove the element
        System.out.println(stack.poll());
        System.out.println(stack);
    }
}
