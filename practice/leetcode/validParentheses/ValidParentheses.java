package practice.leetcode.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
