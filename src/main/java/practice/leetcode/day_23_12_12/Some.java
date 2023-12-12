package practice.leetcode.day_23_12_12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Some {
    public static void main(String[] args) {
//        System.out.println(rearrangeCharacters("codecodecodecode", "codecode"));
//        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
        int[] array = {1, 3, 5, 6};
        System.out.println(searchInsert(array, 2));
        System.out.println(reverseVowels("aA"));
    }

    public static int rearrangeCharacters(String s, String target) {
        if (s.length() < target.length()) {
            return 0;
        }
        Map<Character, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (target.contains(String.valueOf(c))) {
                integerMap.put(c, integerMap.getOrDefault(c, 0) + 1);
            }
        }
        if (integerMap.size() == 1) {
            return 1;
        }
        System.out.println(integerMap);
        int min = 100;
        for (Integer i : integerMap.values()) {
            if (i < min) {
                min = i;
            }
        }
        if (min > 2) {
            min = min / 2;
        }
        return min == 50 ? 0 : min;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midl = left + (right - left) / 2;
            if (nums[midl] == target) {
                return midl;
            }
            if (nums[midl] > target) {
                right = midl - 1;
            } else {
                left = midl + 1;
            }
        }
        return left;
    }

    public static String reverseVowels(String s) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while (left <= right) {
            if (list.contains(c[left]) && list.contains(c[right])) {
                char tmp = c[left];
                c[left] = c[right];
                c[right] = tmp;
                left++;
                right--;
            } else if (list.contains(c[left])) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(c));
        StringBuilder stringBuilder = new StringBuilder();
        for (char value : c) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }
}
