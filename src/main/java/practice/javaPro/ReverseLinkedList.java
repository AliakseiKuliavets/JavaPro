package practice.javaPro;

import practice.some.some.ListNode;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        System.out.println(detectCapitalUse("leetcode"));
        int[] some = {105, 924, 32, 968};
//        System.out.println(divideArray(some));
//        System.out.println(minTimeToType("abc"));
//        System.out.println(canBeIncreasing(some));
//        int[] ranks = {13, 2, 3, 1, 9};
//        char[] suits = {'a', 'a', 'a', 'a', 'a'};
//        System.out.println(bestHand(ranks, suits));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(buddyStrings("abcaa", "abcbb"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        if (word.charAt(1) == word.toUpperCase().charAt(1)) {
            String wordUpper = word.toUpperCase();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != wordUpper.charAt(i)) {
                    return false;
                }
            }
        } else {
            String lowerCase = word.toLowerCase();
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) != lowerCase.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0, j = i + 1; i < nums.length; i += 2, j += 2) {
            if (nums[i] != nums[j]) {
                return false;
            }
        }
        return true;
    }

    public static int minTimeToType(String word) {
        int cnt = word.length();
        char prev = 'a';
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            int dif = Math.abs(prev - cur);
            int res = Math.min(26, dif - 26);
            cnt += res;
            prev = cur;
        }
        return cnt;
    }

    public static boolean canBeIncreasing(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            integerList.add(nums[i]);
        }
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                index = i;
                break;
            } else if (nums[i] > nums[i + 1]) {
                index = i + 1;
                break;
            }
        }
        if (index >= 0 || nums.length == 2) {
            integerList.remove(index);
        }
        if (integerList.size() == 1) {
            return true;
        }
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) >= integerList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        for (int candy : candies) {
            if (maxCandies < candy) {
                maxCandies = candy;
            }
        }
        List<Boolean> booleanList = new ArrayList<>();
        for (Integer integer : candies) {
            if (integer + extraCandies >= maxCandies) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }

    public static String bestHand(int[] ranks, char[] suits) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int rank : ranks) {
            integerMap.put(rank, integerMap.getOrDefault(rank, 0) + 1);
        }
        Map<Character, Integer> integerSuits = new HashMap<>();
        for (char suit : suits) {
            integerSuits.put(suit, integerSuits.getOrDefault(suit, 0) + 1);
        }
        if (integerSuits.size() == 1) {
            return "Flush";
        }
        int max = integerMap.values().stream().mapToInt(Integer::intValue).max().orElse(-1);
        if (max >= 3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }

    public static String largestGoodInteger(String num) {
        StringBuilder stringBuilder = new StringBuilder();
        String longestString = "";
        int number = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if (number <= Character.getNumericValue(num.charAt(i))) {
                if (longestString.length() > 3) {
                    number = Character.getNumericValue(num.charAt(i));
                }
                if (num.charAt(i) == num.charAt(i + 1)) {
                    stringBuilder.append(num.charAt(i));
                    if (num.charAt(i) != num.charAt(i + 2)) {
                        stringBuilder.append(num.charAt(i + 1));
                    }
                } else {
                    if (longestString.length() < stringBuilder.length()) {
                        longestString = String.valueOf(stringBuilder);
                        stringBuilder = new StringBuilder();
                    }
                }
            }
        }
        return longestString.length() < 3 ? "" : longestString;
    }

    public String sortSentence(String s) {
        String[] sting = s.split(" ");
        String[] strings = new String[sting.length];
        for (String string : sting) {
            int digit = Character.getNumericValue(string.charAt(string.length() - 1) - 1);
            strings[digit] = string.substring(0, string.length() - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String so : strings) {
            stringBuilder.append(" ");
            stringBuilder.append(so);
        }
        return String.valueOf(stringBuilder).substring(1);
    }

    public static boolean buddyStrings(String s, String goal) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characterList.add(s.charAt(i));
        }
        int count = 0;
        for (int j = 0; j < goal.length(); j++) {
            if (characterList.get(j) != goal.charAt(j)) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return true;
        }
        if (s.length() > 3) {
            return s.equals(goal.replace(goal.charAt(goal.length() - 1), goal.charAt(0)));
        }
        return !s.equals(goal.replace(goal.charAt(1), goal.charAt(0)));
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left >= right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));

    }
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0){
            if (num % 2 == 0){
                num = num /2;
            }else {
                num = num -1;
            }
            count++;
        }
        return count;
    }
}
