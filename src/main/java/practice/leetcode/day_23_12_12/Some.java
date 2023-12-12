package practice.leetcode.day_23_12_12;

import java.util.*;

public class Some {
    public static void main(String[] args) {
//        System.out.println(rearrangeCharacters("codecodecodecode", "codecode"));
//        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
        int[] array = {1, 3, 5, 2, 4};
        int[] array2 = {6, 5, 4, 3, 2, 1, 7};
        System.out.println(searchInsert(array, 2));
        System.out.println(reverseVowels("aA"));
        System.out.println(Arrays.toString(nextGreaterElement(array, array2)));
        System.out.println(minLength("ABFCACDB"));
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

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    if (j + 1 != nums2.length && nums2[j] > nums2[j + 1]) {
                        result[i] = -1;
                        break;
                    }
                    if (nums2[nums2.length - 1] == nums1[i]) {
                        result[i] = -1;
                    } else {
                        result[i] = nums2[j + 1];
                    }
                    break;
                }
            }
        }
        return result;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    for (int k = j; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            arr[i] = nums2[k];
                            break;
                        }
                        j++;
                    }

                    if (j == nums2.length) {
                        arr[i] = -1;
                    }
                }

            }
        }
        return arr;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String a = String.valueOf(num);
            if (a.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findNumbers2(int[] nums) {
        int count = 0;
        for (int k : nums) {
            if (((int) Math.log10(k) + 1) % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int minLength(String s) {
        List<String> some = Arrays.asList("AB", "CD");
        String d = s;
        for (int i = 0; i < s.length(); i++) {
            for (String entry : some) {
                while (d.contains(entry)) {
                    d = d.replaceAll(entry, "");
                }
            }
        }
        return d.length();
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> integerSet = new HashSet<>();
        for (int j : nums1) {
            integerSet.add(j);
        }
        for (int j : nums2) {
            if (!(integerSet.contains(j))) {
                integerSet.add(j);
            }
        }
        for (int j : nums3) {
            if (!(integerSet.contains(j))) {
                integerSet.add(j);
            }
        }
        return new ArrayList<>(integerSet);
    }
}
