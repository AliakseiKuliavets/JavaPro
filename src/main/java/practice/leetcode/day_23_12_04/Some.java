package practice.leetcode.day_23_12_04;

import practice.leetcode.TreeNode;

import java.util.*;

public class Some {
    public static void main(String[] args) {
        int[] array = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(dominantIndex(array));
        System.out.println(findMaxConsecutiveOnes(array));
        System.out.println(checkDistances("abaccb", array));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> pathss = new HashSet<>();
        for (List<String> list : paths) {
            pathss.add(list.get(0));
        }
        for (List<String> dest : paths) {
            String path = dest.get(1);
            if (!pathss.contains(path)) {
                return path;
            }
        }
        return "";
    }

    //    public TreeNode searchBST(TreeNode root, int val) {
//        if (root.val == val) {
//            return root;
//        }
//        if (root.val > val) return searchBST(root.left, val);
//        else return searchBST(root.right, val);
//    }
    public static int dominantIndex(int[] nums) {
        int result = -1, tmp = -1, ans = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > result) {
                tmp = result;
                result = nums[i];
                ans = i;
            } else if (nums[i] > tmp)
                tmp = nums[i];
        }
        return result >= tmp * 2 ? ans : -1;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (countMax < count) {
                    countMax = count;
                    count = 0;
                }
                count = 0;
            }
        }
        return Math.max(count, countMax);
    }

    public boolean isBoomerang(int[][] points) {
        if ((points[0][0] == points[1][0] && points[0][1] == points[1][1]) ||
                (points[0][0] == points[2][0] && points[0][1] == points[2][1]) ||
                (points[1][0] == points[2][0] && points[1][1] == points[2][1])) {
            return false;
        }

        return (points[0][0] * (points[1][1] - points[2][1]) +
                points[1][0] * (points[2][1] - points[0][1]) +
                points[2][0] * (points[0][1] - points[1][1])) != 0;
    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerSet.contains(nums[i])) return nums[i];
            integerSet.add(nums[i]);
        }
        return 0;
    }

    public static boolean checkDistances(String s, int[] distance) {
        Set<Character> strings = new HashSet<>();
        int countStart = 0;
        int countEnd = 0;
        int q = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(strings.contains(s.charAt(i)))) {
                strings.add(s.charAt(i));
                countStart = i;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        countEnd = j;
                    }
                    if (j == s.length() - 1) {
                        if (distance[q++] != (countEnd - countStart) - 1) {
                            return false;
                        } else {
                            countEnd = -1;
                        }
                    }
                }
            }
        }
        for (int i = distance.length - 1; i > s.length()/2 + 1; i--) {
            if (distance[i] != distance[i-1]){
                return false;
            }
        }
        return true;
    }
}

