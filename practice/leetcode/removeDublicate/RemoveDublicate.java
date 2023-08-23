package practice.leetcode.removeDublicate;

import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {
        int[] nums = {-11, -2, 2, 7, 11, 15, 19, 2, 5, 3};
        int[] uniqueArray = removeDuplicates(nums);
        System.out.println(Arrays.toString(uniqueArray));
    }

    // time -> O(n log n), memory O(1)
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        Arrays.sort(nums);

        int countNum = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[countNum] = nums[i];
                countNum++;
            }
        }

        return Arrays.copyOf(nums, countNum);
    }
}

