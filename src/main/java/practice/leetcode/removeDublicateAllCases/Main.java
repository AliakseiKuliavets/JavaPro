package practice.leetcode.removeDublicateAllCases;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 8, 1, 2, 3, 4, 5, 6, 2, 3, 8, 3, 5, 11, 12, 14, 11, 12, 14, 265, 256, 98, 78, 98};
        System.out.println(Arrays.toString(some(array)));
    }

    private static int[] some(int[] array) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;

    }
}
