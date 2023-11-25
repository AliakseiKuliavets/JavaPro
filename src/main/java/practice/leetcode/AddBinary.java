package practice.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("101",
                "10"));
        System.out.println(isPalindrome(".,"));
    }


    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true; // An empty string is considered a palindrome
        }

        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedString.isEmpty()) {
            return true; // String with only non-alphanumeric characters is considered a palindrome
        }

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
