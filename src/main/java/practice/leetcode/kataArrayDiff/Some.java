package practice.leetcode.kataArrayDiff;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Some {
    public static void main(String[] args) {
        int[] nums = {1, 0};
//        System.out.println(Arrays.toString(nums));
//        moveZeroesToStart(nums);
//        moveZeroesToEnd(nums);
//        System.out.println(Arrays.toString(nums));
        System.out.println(generate(5));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : a) {
            String s = String.valueOf(i);
            stringBuilder.append(s);
        }
        String arrayA = String.valueOf(stringBuilder);
        for (int j : b) {
            String elemB = String.valueOf(j);
            if (arrayA.contains(elemB)) {
                arrayA = arrayA.replaceAll(elemB, "");
            }
        }
        a = new int[arrayA.length()];
        for (int i = 0; i < arrayA.length(); i++) {
            int newA = Integer.parseInt(String.valueOf(arrayA.charAt(i)));
            a[i] = newA;
        }
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
        return a;
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || b.length != a.length) {
            throw new IllegalArgumentException();
        }
        // Create a copy of array 'a' to avoid modifying the original array
        int[] squaredA = Arrays.copyOf(a, a.length);

        // Square each element in array 'a'
        for (int i = 0; i < squaredA.length; i++) {
            squaredA[i] = squaredA[i] * squaredA[i];
        }

        // Sort both arrays after squaring the elements
        Arrays.sort(squaredA);
        Arrays.sort(b);

        return Arrays.equals(squaredA, b);
    }

    public static void moveZeroesToStart(int[] nums) {
        int newNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int a = nums[newNums];
                nums[i] = a;
                nums[newNums++] = 0;
            }
        }
    }

    public static void moveZeroesToEnd(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int newNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[newNums];
                nums[newNums] = temp;
                newNums++;
            }
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}

