package practice.leetcode.day_23_12_07;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Some {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(rearrangeCharacters("ilovecodingonleetcode", "code"));
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77})));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] some = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                some[i] = 1;
            }
        }
        System.out.println(Arrays.toString(some));
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < some.length; i++) {
            if (some[i] != 1) {
                count++;
            } else {
                list.add(count);
                count = 0;
            }
        }
        System.out.println(list);
        for (int i = 0; i < some.length; ) {
            for (Integer in : list) {
                int soms = in;
                for (int j = i; j < some.length; j++) {
                    if (soms == 0) {
                        break;
                    }
                    some[i++] = soms--;

                }
                some[i++] = 0;
            }
            break;
        }
        int prev = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) prev = 0;
            else some[i] = Math.min(some[i], ++prev);
        }
        return some;
    }

    public static int rearrangeCharacters(String s, String target) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char[] c2 = target.toCharArray();
        Arrays.sort(c2);

        Map<Character, Integer> stringIntegerMap = new HashMap<>();
        for (char value : c) {
            stringIntegerMap.put(value, stringIntegerMap.getOrDefault(value, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < c2.length; i++) {
            for (Map.Entry<Character, Integer> entry : stringIntegerMap.entrySet()) {
                if (c2[i] == entry.getKey()) {
                    list.add(entry.getValue());
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 0) {
            return false;
        }
        List<Integer> seen = new ArrayList<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            int tmp = n;
            n = 0;
            while (tmp > 0) {
                int digit = tmp % 10;
                n += digit * digit;
                tmp /= 10;
            }
        }
        return true;
    }

    public static boolean isMonotonic(int[] nums) {
        int count = 0;
        if (nums[0] >= nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    count++;
                }
            }
            return count == nums.length - 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    count++;
                }
            }
            return count == nums.length - 1;
        }
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int j : nums) {
            if (j < 10) {
                list.add(j);
            } else {
                String s = String.valueOf(j);
                for (int i = 0; i < s.length(); i++) {
                    list.add(s.charAt(i) - 48);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                count++;
                sum += num;
            }
        }
        return count != 0 ? sum / count : 0;
    }

    public int isWinner(int[] player1, int[] player2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < player1.length; i++) {
            if (player1[i] == 10) {
                sum1 += player1[i];
                if (i + 1 < player1.length) {
                    sum1 += player1[i + 1];
                    if (i + 2 < player1.length) {
                        sum1 += player1[i + 2];
                    }
                }
            } else {
                sum1 += player1[i];
            }
        }

        for (int i = 0; i < player2.length; i++) {
            if (player2[i] == 10) {
                sum2 += player2[i];
                if (i + 1 < player2.length) {
                    sum2 += player2[i + 1];
                    if (i + 2 < player2.length) {
                        sum2 += player2[i + 2];
                    }
                }
            } else {
                sum2 += player2[i];
            }
        }
        if (sum1 == sum2) {
            return 0;
        }

        return sum1 > sum2 ? 1 : 2;
    }
}
