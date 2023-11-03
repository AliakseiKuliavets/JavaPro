
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]*/

package practice.leetcode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    // time -> O(n), memory O(1)
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left],nums[right]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};

    // time -> O(n^2), memory O(n)
    //    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{nums[i], nums[j]};
//                }
//            }
//        }
//        return new int[]{};
//    }


    // time -> O(log n), memory O(n)
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            int index = binarySearch(nums, complement, i + 1);
//            if (index != -1) {
//                return new int[]{nums[i], complement};
//            }
//        }
//        return new int[]{};
//    }
//    public static int binarySearch(int[] nums, int target, int start) {
//        int left = start;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }


        // time -> O(n), memory O(n)
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numIndexMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (numIndexMap.containsKey(complement)) {
//                return new int[]{numIndexMap.get(complement), i};
//            }
//            numIndexMap.put(nums[i], i);
//        }
//        return new int[]{};
    }
}

