package lesson.lesson11;

import lesson.lesson11.cat.Cat;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Cat> stack = new Stack<>();
        System.out.println("---------------------------");
        System.out.println(stack.empty());
        System.out.println("---------------------------");

        stack.push(new Cat(17,"Pavel"));
        System.out.println(stack.empty());
        System.out.println("---------------------------");

        Cat elementFromStack = stack.pop();
        System.out.println("Your number is: " + elementFromStack);
        System.out.println("---------------------------");
        System.out.println(stack.empty());
        System.out.println("---------------------------");
    }
}
