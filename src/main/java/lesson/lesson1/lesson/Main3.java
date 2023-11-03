package lesson.lesson1.lesson;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {2,4,3,2};
        System.out.println(new Main3().sumArray(array));
    }
    private int sumArray(int[] array) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumOdd = sumOdd + array[i];
            }
        }
        return sumEven - sumOdd;
    }
}
