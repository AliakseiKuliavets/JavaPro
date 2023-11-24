package practice.some.some;

import practice.leetcode.removeDublicatwsFromSortedList.RemoveDublicates;

import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(maximumTime("?5:13"));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] numberIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    numberIndex[0] = i;
                    numberIndex[1] = j;
                }
            }
        }
        return numberIndex;
    }


    private static final ListNode listNode = new ListNode();

    public int reverse(int x) {
        long t;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        String reverse = String.valueOf(stringBuilder.reverse());
        if (reverse.charAt(reverse.length() - 1) == '-') {
            String s = reverse.replaceAll("-", "");
            t = Long.parseLong("-".concat(s));
            if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) t;
            }
        } else {
            t = Long.parseLong(reverse);
            if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) t;
            }
        }
    }

    public static String maximumTime(String time) {
        char[] chars = time.toCharArray();
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == '?') {
                if (i == 0 && (chars[i + 1] == '3'
                        || chars[i + 1] == '2'
                        || chars[i + 1] == '1'
                        || chars[i + 1] == '0'
                        || chars[i + 1] == '?')) {
                    chars[i] = '2';
                } else if (i == 0 && chars[i + 1] == '4') {
                    chars[i] = '1';
                } else if (i == 1 && chars[i - 1] != '2') {
                    chars[i] = '9';
                } else if (i == 1 && chars[i - 1] == '2') {
                    chars[i] = '3';
                } else if (i == 3 && chars[i - 1] == ':') {
                    chars[i] = '5';
                } else if (i == 4) {
                    chars[i] = '9';
                }
            }
        }

        StringBuilder timeRe = new StringBuilder();
        for (Character character : chars) {
            timeRe.append(character);
        }
        return String.valueOf(timeRe);

    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.val);
            head = head.next;
        }
        String a = String.valueOf(stringBuilder);
        String b = String.valueOf(stringBuilder.reverse());

        return a.equals(b);
    }
}