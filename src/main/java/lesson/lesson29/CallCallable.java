package lesson.lesson29;

import java.util.concurrent.*;

public class CallCallable {
    static int fResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialCollable factorialCollable = new FactorialCollable(5);
        Future<Integer> future = executorService.submit(factorialCollable);
        try {
            fResult = future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        System.out.println(fResult);
    }
}

class FactorialCollable implements Callable<Integer> {
    int f;

    public FactorialCollable(int f) {
        this.f = f;
    }

    @Override
    public Integer call() {
        if (f < 0) {
            throw new IllegalArgumentException("Incorrect factorial value");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
