package practice.leetcode.day_23_12_25;

import java.util.*;

public class Some {
    public static void main(String[] args) {
        int[] nums = {1, 4};
//        System.out.println(totalSteps2(nums));
        System.out.println(Arrays.toString(searchRange(nums, 4)));
    }


    public static int totalSteps(int[] nums) {
        int[] num2 = nums.clone();
        Arrays.sort(num2);
        if (Arrays.equals(nums, num2)) {
            return 0;
        }
        List<Integer> integerList = new LinkedList<>();
        for (int num : nums) {
            integerList.add(num);
        }

        List<Integer> second = new LinkedList<>(integerList);
        Collections.sort(second);

        int count = 0;
        while (!(integerList.equals(second))) {
            for (int i = 1; i < integerList.size(); i++) {
                if (integerList.get(i - 1) > integerList.get(i)) {
                    for (int j = 0; j < second.size(); j++) {
                        if (second.get(j).equals(integerList.get(i))) {
                            second.remove(j);
                            break;
                        }
                    }
                    integerList.remove(i);
                }
            }
            count++;
        }
        return count;
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }
        if (nums[nums.length - 1] == target) {
            int start = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] != target) {
                    break;
                }
                start = i;
            }
            return new int[]{start, nums.length - 1};
        } else if (nums[0] == target) {
            int finish = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != target) {
                    break;
                }
                finish = i;
            }
            return new int[]{0, finish};
        } else {
            int indexStart = 0;
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    indexStart = mid;
                    break;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (indexStart == 0) {
                return new int[]{-1, -1};
            }
            if (nums[indexStart - 1] != nums[indexStart] && nums[indexStart] != nums[indexStart + 1]) {
                return new int[]{indexStart, indexStart};
            }

            int left2 = indexStart;
            int right2 = indexStart;
            while (nums[left2] == target) {
                left2--;
            }
            while (nums[right2] == target) {
                right2++;
            }

            return new int[]{left2 + 1, right2 - 1};
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
