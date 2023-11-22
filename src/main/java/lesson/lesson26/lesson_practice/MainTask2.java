package lesson.lesson26.lesson_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTask2 {
    static int sumNumber = 0;

    public static void main(String[] args) {
        int[] array = {4, 6, 3, 7, 10, 4, 6, 3, 7, 10, 4, 6, 3, 7, 10, 4, 6, 3, 7, 10};
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int j : array) {
            executorService.execute(new CountNumber(j));
        }
        System.out.println("MAIN END");
        executorService.shutdown();
        System.out.println(sumNumber);
    }
}

class CountNumber implements Runnable {
    int number;

    public CountNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        MainTask2.sumNumber += number;
    }
}
