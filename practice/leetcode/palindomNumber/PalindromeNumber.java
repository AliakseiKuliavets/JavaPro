package practice.leetcode.palindomNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String first = String.valueOf(x);
        StringBuilder revers = new StringBuilder(first);
        revers.reverse();
        return first.contentEquals(revers);
    }
}
