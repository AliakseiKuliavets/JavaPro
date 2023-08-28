package lesson.lesson1;

public class Main1 {
    public static void main(String[] args) {
        int[] array = {12,445,678,9};

        System.out.println(new Main1().returnMin(array));
    }
    private int returnMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            if (min > array[i+1]){
                min = array[i+1];
            }
        }
        return min;
    }
}
