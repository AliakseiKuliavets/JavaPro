package practice.leetcode.intersectionTwoArray;

import java.util.Arrays;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        System.out.println(Arrays.toString(new IntersectionArray().intersect(num1, num2)));
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int minLength = Math.min(nums1.length , nums2.length);
        int count = 0;
        int[] array = new int[minLength];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    array[count] = nums1[i];
                    count++;
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return Arrays.copyOf(array, count);
    }
}
