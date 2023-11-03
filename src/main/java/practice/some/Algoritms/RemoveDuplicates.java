package practice.some.Algoritms;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {4,7,2,2,4,3,8,10,11,10,7,4};
        Arrays.sort(array);

        int newLength = lengthNewArray(array);

        System.out.println("New Length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static int  lengthNewArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[uniqueCount - 1]) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
