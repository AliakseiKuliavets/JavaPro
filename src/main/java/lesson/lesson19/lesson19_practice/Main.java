package lesson.lesson19.lesson19_practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.getArrayBySize(5);
        System.out.println(Arrays.toString(array));

        System.out.println(arrayService.getArrayElementIndex(0,array));
        arrayService.setArrayElementIndex(0,23,array);
        System.out.println(Arrays.toString(array));
    }
}
