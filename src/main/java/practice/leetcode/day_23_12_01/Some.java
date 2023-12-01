package practice.leetcode.day_23_12_01;

import java.util.*;
import java.util.stream.Collectors;

public class Some {
    public static void main(String[] args) {
        int[] nums = {12, 2, 3, 4, 56, 7, 89};
        System.out.println(maxProfit(nums));
        System.out.println(findTheLongestBalancedSubstring("01000111"));
        System.out.println(mostFrequentEven(nums));
        System.out.println(percentageLetter("foobar",'o'));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public char findTheDifference(String s, String t) {
        char[] some = s.toCharArray();
        Arrays.sort(some);
        char[] tome = t.toCharArray();
        Arrays.sort(tome);
        for (int i = 0; i < some.length; i++) {
            if (some[i] != tome[i]) {
                return tome[i];
            }
        }
        return tome[tome.length - 1];
    }

    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                stringBuilder.reverse();
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int zero = 0;
        int max = 0;
        int one = 0;


        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zero++;
                one = 0;
            } else {
                one++;
                if (zero >= one) {
                    max = Math.max(max, one + zero);
                }
                if (i + 1 < n && s.charAt(i + 1) == '0') {
                    zero = 0;
                }
            }
        }

        return max;
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                integerMap.put(num, integerMap.getOrDefault(num, 0) + 1);
            }
        }
        if (integerMap.isEmpty()) {
            return -1;
        }
        int max = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            if (entry.getValue() > value) {
                value = entry.getValue();
                max = entry.getKey();
            }
        }
        List<Integer> integerList = new ArrayList<>();
        Arrays.sort(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                integerList.add(num);
                break;
            }
        }
        if (integerList.isEmpty()) {
            return max;
        }
        return value != 0 ? max : integerList.get(0);
    }


    public String[] dividseString(String s, int k, char fill) {
        int length = s.length();
        int fullChunks = length / k;
        int remainder = length % k;
        int arraySize = fullChunks + (remainder > 0 ? 1 : 0);

        String[] res = new String[arraySize];
        for (int i = 0, j = 0; i < s.length() / k; i++, j += k) {
            res[i] = s.substring(j, j + k);
        }
        if (s.length() % k != 0) {
            String add = s.substring(length - remainder)
                    + String.valueOf(fill).repeat(Math.max(0, k - remainder));
            res[res.length - 1] = add;
        }
        return res;
    }

    public static int percentageLetter(String s, char letter) {
       int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter){
                count++;
            }
        }
        return (int) Math.floor(((double) count / s.length()) * 100);
    }
}
