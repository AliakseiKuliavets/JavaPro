package practice.javaPro.StackExample;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Kolya");
        stack.push("Anton");
        stack.push("Oleg");
        stack.push("Katya"); // обавляем оюбекты
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // показать элемент и удалить из массива
            System.out.println(stack);
        }

        System.out.println(stack.peek()); // показать элемент но не удалять
    }
}
