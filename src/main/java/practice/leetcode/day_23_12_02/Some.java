package practice.leetcode.day_23_12_02;

import java.time.LocalDate;
import java.util.*;

public class Some {
    public static void main(String[] args) {
        String[] s = {"cullp", "ypfyqcljk", "jtuogvscob", "dsriyigc", "fr", "jtuogvscou", "doivwcgxpo", "jtuogvscob",
                "chuiw", "fqdhyhkvtz", "cszrtrff", "kssjy", "ps", "xvax", "vekbmwwnra"};
//        System.out.println(prefixCount(s, "jtuogvsco"));
        int[] arrayInteger = {12, 6, 1, 2, 7};
        int[][] array = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
//        System.out.println(findLucky(arrayInteger));
//        System.out.println(Arrays.toString(finalPrices(arrayInteger)));
//        System.out.println(pickGifts(arrayInteger, 4));
//        System.out.println(Arrays.toString(maxSubsequence(arrayInteger, 2)));
//        System.out.println(differenceOfSum(arrayInteger));
//        System.out.println(diagonalPrime(array));
//        System.out.println(hasAlternatingBits(11));
//        System.out.println(largeGroupPositions("abbxxxxzzy"));
//        System.out.println(selfDividingNumbers(1, 22));
//        System.out.println(maximumTripletValue(arrayInteger));
        System.out.println(isLongPressedName("alex", "aaleex"));
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
            time += Math.max(horizontal, vertical);
        }
        return time;
    }

    public int largestPerimeter(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        if (nums.length == 3) {
            if (nums[0] + nums[1] > nums[2] &&
                    nums[0] + nums[2] > nums[1] &&
                    nums[1] + nums[2] > nums[0]
            ) {
                return nums[0] + nums[1] + nums[2];
            }
        }
        Arrays.sort(nums);
        for (int k = nums.length - 1; k >= 2; k--) {
            int c = nums[k];
            int b = nums[k - 1];
            int a = nums[k - 2];
            if (a + b > c) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i) + 1) {
                return false;
            }
        }
        return true;
    }

    public int dayOfYear(String date) {
        String[] date1 = date.split("-");
        LocalDate localDate = LocalDate.of(
                Integer.parseInt(date1[0]),
                Integer.parseInt(date1[1]),
                Integer.parseInt(date1[2]));
        return localDate.getDayOfYear();
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> listList = new ArrayList<>();
        int left = 0;
        int left2 = 1;

        while (left < s.length() && left2 < s.length()) {
            List<Integer> list = list(s, left, left2);
            if (list != null) {
                listList.add(list);
                left = list.get(1);
                left2 = left + 1;
            } else {
                left++;
                left2 = left + 1;
            }
        }
        return listList;
    }

    private static List<Integer> list(String s, int left, int left2) {
        if (left2 >= s.length()) {
            return null;
        }
        int counter = 0;
        while (left2 < s.length() && s.charAt(left) == s.charAt(left2)) {
            counter++;
            left2++;
        }
        if (counter >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(left);
            list.add(left2 - 1);
            return list;
        }
        return null;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (returnNum(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    private static boolean returnNum(int left) {
        int num = left;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                return false;
            }
            if (left % rem != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static int sumBase(int n, int k) {
        String a = Integer.toString(n, k);
        int aa = Integer.parseInt(a);
        int sum = 0;
        int tmp = aa;
        while (tmp > 0) {
            int num = tmp % 10;
            sum += num;
            tmp /= 10;
        }
        return sum;
    }

    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int countA = 0;
        for (Character c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
            }
        }
        return countA < 2;
    }

    public static int distinctAverages(int[] nums) {
        if (nums.length == 2) {
            return 1;
        }
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            set.add((double) (nums[left++] + nums[right--]) / 2);
        }
        return set.size();
    }

    public static long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    max = Math.max(max, (nums[i] - nums[j]) * ((long) nums[k]));
                }
            }
        }
        return max;
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() == 1 && typed.length() == 1) {
            return name.equals(typed);
        }
        if (name.equals(typed)){
            return true;
        }
        Map<Character, Integer> characterIntegerMap1 = new HashMap<>();
        for (int i = 0; i < typed.length(); i++) {
            characterIntegerMap1.put(typed.charAt(i),
                    characterIntegerMap1.getOrDefault(typed.charAt(i), 0) + 1);
        }
        Map<Character, Integer> characterIntegerMap2 = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            characterIntegerMap2.put(name.charAt(i),
                    characterIntegerMap2.getOrDefault(name.charAt(i), 0) + 1);
        }
        if (characterIntegerMap1.size() != characterIntegerMap2.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry1 : characterIntegerMap2.entrySet()) {
            for (Map.Entry<Character, Integer> entry2 : characterIntegerMap1.entrySet()) {
                if (entry1.getKey().equals(entry2.getKey())) {
                    if (entry1.getValue() > entry2.getValue()) {
                        return false;
                    }
                }
            }
        }
        char[] name1 = name.toCharArray();
        Arrays.sort(name1);
        char[] typed1 = typed.toCharArray();
        Arrays.sort(typed1);
        return !Arrays.equals(name1, typed1);
    }
}
