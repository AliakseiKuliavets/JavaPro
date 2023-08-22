package practice.leetcode.palindomNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String first = number;
        StringBuilder revers = new StringBuilder(first);
        revers.reverse();
        if (first.equals(revers.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
