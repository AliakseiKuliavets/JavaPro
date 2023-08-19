package practice.some.Algoritms;

import java.util.Arrays;

public class ArrayInverter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }
    private static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        };
    }
}
