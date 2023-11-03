package practice.leetcode.mergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arrayFirst = {0};
        int[] arraySecond = {1};
        int m = 0;
        int n = 1;
        new MergeSortedArray().merge(arrayFirst,m,arraySecond,n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0) {
            System.out.println(Arrays.toString(nums2));
        }
        if (nums2.length == 0) {
            System.out.println(Arrays.toString(nums1));
        }
        int[] array = new int[m+n];
        int i = 0;

        while (m != 0 && n != 0) {
           if (nums1[m-1] < nums2[n-1]) {
               array[i] = nums2[n-1];
               i++;
               n--;
           } else {
               array[i] = nums1[m-1];
               i++;
               m--;
           }
        }
        while (m != 0) {
            array[i] = nums1[m-1];
            i++;
            m--;
        }
        while (n != 0) {
            array[i] = nums2[n-1];
            i++;
            n--;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
