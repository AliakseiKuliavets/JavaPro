package summarySession.friday180823;

import java.util.Arrays;

public class AlgHM {
    public static void main(String[] args) {

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

        if (arr1.length < arr2.length) {
            System.out.println(Arrays.toString(arraySum(arr1, arr2)));
        } else {
            System.out.println(Arrays.toString(arraySum(arr2, arr1)));
        }
    }

    public static int[] arraySum(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; j < arr1.length; i += 2, j++) {
            result[i] = arr1[j];
        }
        for (int k = 0, l = 0; l < arr2.length; k++) {
            if (result[k] == 0) {
                result[k] = arr2[l];
                l++;
            }
        }
        return result;
    }
}
// currentTimeMillis()
