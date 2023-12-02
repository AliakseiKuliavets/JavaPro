package practice.leetcode.day_23_12_02;

import java.util.*;

public class Some {
    public static void main(String[] args) {
        String[] s = {"cullp", "ypfyqcljk", "jtuogvscob", "dsriyigc", "fr", "jtuogvscou", "doivwcgxpo", "jtuogvscob",
                "chuiw", "fqdhyhkvtz", "cszrtrff", "kssjy", "ps", "xvax", "vekbmwwnra"};
//        System.out.println(prefixCount(s, "jtuogvsco"));
        int[] arrayInteger = {1, 15, 6, 3};
        int[][] array = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
//        System.out.println(findLucky(arrayInteger));
//        System.out.println(Arrays.toString(finalPrices(arrayInteger)));
//        System.out.println(pickGifts(arrayInteger, 4));
//        System.out.println(Arrays.toString(maxSubsequence(arrayInteger, 2)));
//        System.out.println(differenceOfSum(arrayInteger));
        System.out.println(diagonalPrime(array));
    }

    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        for (String word : words) {
            if (word.length() >= pref.length()) {
                if (word.startsWith(pref)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int j : arr) {
            integerMap.put(j, integerMap.getOrDefault(j, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                }
            }
        }
        return max != 0 ? max : -1;
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (j > i && prices[j] <= prices[i]) {
                    int tmp = prices[i] - prices[j];
                    prices[i] = tmp;
                    break;
                }
            }
        }
        return prices;
    }

    public static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int max = maxFind(gifts);
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j] == max) {
                    max = (int) Math.sqrt(gifts[j]);
                    gifts[j] = max;
                    break;
                }
            }
        }
        long sum = 0;
        for (Integer i : gifts) {
            sum += i;
        }
        return sum;
    }

    private static int maxFind(int[] gifts) {
        int max = 0;
        for (int gift : gifts) {
            if (gift > max) {
                max = gift;
            }
        }
        return max > 0 ? max : 1;
    }

    public int[] diStringMatch(String s) {
        int[] array = new int[s.length() + 1];
        int iMax = s.length();
        int dMin = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                array[i] = dMin++;
            } else {
                array[i] = iMax--;
            }
        }
        array[s.length()] = dMin;
        return array;
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        Arrays.sort(nums);
        int[] result = new int[k];
        for (int i = nums.length - 1, j = 0; j < k; i--, j++) {
            result[j] = nums[i];
        }
        return result;
    }

    public static int differenceOfSum(int[] nums) {
        int count = 0;
        int countSum = 0;
        for (int num : nums) {
            count += num;
            int sum = 0;
            if ((num > 9) || (num < -9)) {
                int tmp = num;
                while (tmp != 0) {
                    sum += tmp % 10;
                    tmp = tmp / 10;
                }
            } else {
                sum += num;
            }
            countSum += sum;
        }
        return count - countSum;
    }

    public static int diagonalPrime(int[][] nums) {
        Set<Integer> integerList = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integerList.add(nums[i][i]);
            integerList.add(nums[i][nums.length - i - 1]);
        }
        int max = 0;
        for (Integer integer : integerList) {
            if (isPrime(integer) && integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int[] first = points[i - 1];
            int[] last = points[i];
            int horizontal = Math.abs(last[0] - first[0]);
            int vertical = Math.abs(last[1] - first[1]);
            time += Math.max(horizontal,vertical);
        }
        return time;
    }
}
