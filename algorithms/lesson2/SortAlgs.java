package algorithms.lesson2;

import java.util.Arrays;

public class SortAlgs {
    public static void main(String[] args) {
        int[] numbers = new  int[] {12,34,567,809,765,432,1};
        System.out.println(Arrays.toString(numbers));
        mySort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    private static void mySort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
    }
}
