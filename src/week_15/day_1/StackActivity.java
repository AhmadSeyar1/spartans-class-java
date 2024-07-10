package week_15.day_1;

import java.util.Stack;

public class StackActivity {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // one way
//        List<String> stackTwo = new Stack<>();// second way
//        var stackThree = new Stack<String>(); // third way

        // Add elements to stack
        stack.push("Tony");
        stack.push("Bob");
        stack.push("Eva");
        stack.push("Trevor");

        // Print the elements of stack
        System.out.println(stack);

        // Remove element from stack
        stack.pop(); // The last element will be removed (Trevor)

        // Print the updated stack
        System.out.println(stack);

        // To Check the top of the stack
        System.out.println(stack.peek());

        // Remove the top element
        stack.pop();

        System.out.println(stack);

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // will give you true or false

        while (!stack.isEmpty()) {
            stack.pop(); // will delete everything
        }
        System.out.println(stack);
    }
}
