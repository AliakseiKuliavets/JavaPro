package practice.some.Algoritms;

import java.util.Arrays;

public class ArrayInverter {
    public static void main(String[] args) {
        int[] array = {3,6,1,9,2,3};
        reversArray(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reversArray(int[] array){
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
