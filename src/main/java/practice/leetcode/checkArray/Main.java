package practice.leetcode.checkArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1, 0, 1};
        int k = 2;
//        System.out.println(kLengthApart(nums, k));
//        System.out.println(largestOddNumber("7542351161"));
//        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(getLucky("leetcode", 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        count++;
                    } else {
                        if (count < k) {
                            return false;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }

    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            stringBuilder.append(strings[i]);
            stringBuilder.append(" ");
        }
        return String.valueOf(stringBuilder).substring(1);
    }

    public static String largestOddNumber(String num) {
        if (num.length() == 1 && Long.parseLong(num) % 2 != 0) {
            return num;
        }
        long a = Long.parseLong(num);
        long maxOdd = Integer.MIN_VALUE;
        long tmp = a;
        while (tmp > 0) {
            tmp = tmp / 10;
            if (tmp % 2 != 0) {
                if (maxOdd < tmp) {
                    maxOdd = tmp;
                }
            }
        }
        long max;
        if (a % 2 != 0) {
            max = Math.max(maxOdd, a);
        } else {
            if (maxOdd == Integer.MIN_VALUE) {
                return "";
            }
            max = maxOdd;
        }
        return String.valueOf(max);
    }

    public static String mergeAlternately(String word1, String word2) {
        String[] strings = new String[word1.length() + word2.length()];
        int index = 0;
        int indexA = 0;
        int indexB = 0;
        while (strings[index] == null || strings.length != index) {
            if (indexA > indexB) {
                strings[index] = String.valueOf(word2.charAt(indexB));
                index++;
                indexB++;
            } else {
                strings[index] = String.valueOf(word1.charAt(indexA));
                index++;
                indexA++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strings) {
            stringBuilder.append(s);
        }
        return String.valueOf(stringBuilder);
    }

    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums).max().orElse(-1);
        int min = Arrays.stream(nums).min().orElse(-1);
        int divisor = min;
        while (divisor != 1) {
            if (min % divisor == 0 && max % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return divisor;
    }

    public static int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i) - 96);
        }
        String number = String.valueOf(stringBuilder);
        int result = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < number.length(); j++) {
                result += (number.charAt(j) - 48);
            }
            number = String.valueOf(result);
            if (i != k) {
                result = 0;
            }
        }
        return result;
    }
}
