package lesson.lesson11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("---------------------------");
        System.out.println(stack.empty());
        System.out.println("---------------------------");

        stack.push(17);
        System.out.println(stack.empty());
        System.out.println("---------------------------");

        Integer elementFromStack = stack.pop();
        System.out.println("Your number is: " + elementFromStack);
        System.out.println("---------------------------");
        System.out.println(stack.empty());
        System.out.println("---------------------------");
    }
}
