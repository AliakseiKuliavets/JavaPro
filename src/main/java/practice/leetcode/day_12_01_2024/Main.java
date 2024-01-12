package practice.leetcode.day_12_01_2024;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1,6,2,9,2,6};
        System.out.println(Arrays.toString(ints));
        bybbleSort(ints);
        System.out.println(Arrays.toString(ints));
        int k = 6;
        System.out.println(findIndexElem(ints,k));
        System.out.println(recusion(k));
        String some = "Some people!!";
        System.out.println(returnReverseString(some));
    }

    private static String returnReverseString(String some) {
        char[] chars = some.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right){
            char a = chars[left];
            chars[left++] = chars[right];
            chars[right--] = a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= chars.length - 1; i++) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    private static int recusion(int k) {
        if (k == 0 || k == 1){
            return 1;
        }
        return k * recusion(k - 1);
    }

    private static int findIndexElem(int[] ints, int k) {
        int left = 0;
        int right = ints.length - 1;
        while (left < right){
            int midl = left + (right - left) / 2;
            if (ints[midl] == k) {
                return midl;
            } else if (ints[midl] > k) {
                right = midl - 1;
            } else {
                left = midl + 1;
            }
        }
        return -1;
    }

    private static void bybbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]){
                    int swap = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = swap;
                }
            }
        }
    }




}
