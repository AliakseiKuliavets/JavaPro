package lesson.lesson26.lesson_practice;


import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] sortArr = {1, 8, 5, 3, 11, 1, 1};
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < sortArr.length; i++) {
            executorService.execute(new Sorted(sortArr, i));
        }
        System.out.println("MAIN END");
        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        System.out.println(Arrays.toString(sortArr));
    }
}

class Sorted implements Runnable {

    int[] sortArr;
    int i;

    public Sorted(int[] sortArray, int i) {
        this.sortArr = sortArray;
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 0; j < sortArr.length - i - 1; j++) {
            if (sortArr[j + 1] < sortArr[j]) {
                int swap = sortArr[j];
                sortArr[j] = sortArr[j + 1];
                sortArr[j + 1] = swap;
            }
        }
    }
}
