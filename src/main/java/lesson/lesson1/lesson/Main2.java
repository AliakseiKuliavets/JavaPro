package lesson.lesson1.lesson;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {12,34,56,78,99,876,54,3,1,43,1,2};
        System.out.println(new Main2().returnSecondMin(array));
    }
    private int returnSecondMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < min) {
                secondMin = min;
                min = j;
            } else if ((j < secondMin && j != min)) {
                secondMin = j;
            }
        }
        return secondMin;
    }
}
