package practice.leetcode.day_23_12_03;

import java.util.*;

public class Some {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6};
        duplicateZeros(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(tribonacci(4));
//        System.out.println(Arrays.toString(arrayRankTransform(array)));
//        System.out.println(pivotIndex(array));
        System.out.println(removeDuplicates("pbbcggttciiippooaais", 2));
        System.out.println(removeDuplicates("nnwssswwnvbnnnbbqhhbbbhmmmlllm", 3));


    }

    public static void duplicateZeros(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int j : arr) {
            if (j == 0) {
                list.add(0);
                int index = list.size() - 1;
                list.add(index, 0);
            } else {
                list.add(j);
            }
            if (list.size() == arr.length) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public void duplicateZeros2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
            if (j == 0) {
                list.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    static int[] memo;

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (memo == null) {
            memo = new int[n + 1];
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        return memo[n];
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                integerList.add(nums[i + 1]);
            }
        }
        int[] array = new int[integerList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = integerList.get(i);
        }
        return array;
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] array = arr.clone();
        Arrays.sort(arr);

        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        for (int j : arr) {
            if (!rankMap.containsKey(j)) {
                rankMap.put(j, rank++);
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = rankMap.get(array[i]);
        }
        return array;
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int midl = left + (right - left) / 2;
            if (nums[midl] == target) {
                return target;
            } else if (nums[midl] > target) {
                right = midl--;
            } else {
                left = midl++;
            }
        }
        return -1;
    }

    public static int findComplement(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String binaryString = Integer.toBinaryString(num);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                stringBuilder.append('1');
            } else {
                stringBuilder.append('0');
            }
        }
        return Integer.parseInt(String.valueOf(stringBuilder), 10);
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewels.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String removeDuplicates(String s, int k) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }
        String finals = s;
        for (int d = 0; d < 3; d++) {
            for (Character c : characterSet) {
                String some = String.valueOf(c).repeat(Math.max(0, k));

                while (finals.contains(some)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < finals.length(); i++) {
                        stringBuilder.append(finals.charAt(i));
                    }
                    int start = -1;
                    int end = -1;
                    for (int i = 0, q = 1; i < finals.length() - 1; i++, q++) {
                        if (finals.charAt(i) == some.charAt(0)) {
                            if (start == -1) {
                                if (finals.charAt(i + 1) == some.charAt(0)) {
                                    start = i;
                                }
                            }
                            if (finals.charAt(q) == finals.length() - 1 && finals.charAt(q) == finals.length() - 2) {
                                if (finals.charAt(q) == some.charAt(0)) {
                                    end = finals.length() - 1;
                                }
                            }
                            if (finals.charAt(q) != some.charAt(0)) {
                                if (start != -1) {
                                    end = q;
                                }
                            }
                        }
                    }
                    if (start > -1) {
                        finals = String.valueOf(stringBuilder.delete(start, end));
                    }
                }
            }
        }
        return finals;
    }
}
