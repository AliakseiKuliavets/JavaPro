package practice.leetcode.day_23_12_08;

import java.time.LocalDate;
import java.util.*;

public class SomeDay8 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int digit = target - nums[i];
            if (integerMap.containsKey(digit)) return new int[]{i, integerMap.get(digit)};
            integerMap.put(nums[i], i);
        }
        return null;
    }

    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        String rev = String.valueOf(stringBuilder.reverse());
        return a.equals(rev);
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int revers = 0;
        int tmp = x;
        while (tmp != 0) {
            int some = tmp % 10;
            revers = revers * 10 + some;
            tmp = tmp / 10;
        }
        return revers == x;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put('I', 1);
        stringIntegerMap.put('V', 5);
        stringIntegerMap.put('X', 10);
        stringIntegerMap.put('L', 50);
        stringIntegerMap.put('C', 100);
        stringIntegerMap.put('D', 500);
        stringIntegerMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && stringIntegerMap.get(s.charAt(i)) > stringIntegerMap.get(s.charAt(i - 1))) {
                result += stringIntegerMap.get(s.charAt(i)) - 2 * stringIntegerMap.get(s.charAt(i - 1));
            } else {
                result += stringIntegerMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        String res = null;
        int count = 0;
        int countChar = 0;
        for (int i = 1; i < strs.length; i++) {
            res = stringBuilder.toString();
            String s = res + strs[0].charAt(countChar);
            if (strs[i].startsWith(s)) {
                count++;
            }
            if (count == strs.length - 1) {
                stringBuilder.append(strs[0].charAt(countChar));
                countChar++;
                count = 0;
                i = 0;
            }
        }
        return res == null ? "" : res;
    }

    public boolean isValid(String s) {
        Stack<Character> parent = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                parent.push(')');
            } else if (c == '{') {
                parent.push('}');
            } else if (c == '[') {
                parent.push(']');
            } else if (parent.isEmpty() || parent.pop() != c) {
                return false;
            }
        }
        return parent.isEmpty();
    }
    public int dayOfYear(String date) {
        String[] s = date.split("-");

        LocalDate localDate = LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
        return localDate.getDayOfYear();
    }
}
