package practice.some.Algoritms;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 50;
        long start = System.currentTimeMillis();
        System.out.println("Цикл for " + calculateWithFor(n));
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish - start) + " ms");

        System.out.println();

        long start2 = System.currentTimeMillis();
        System.out.println("Рекурсия  " + recursive(n));
        long finish2 = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish2 - start2) + " ms");
    }
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    private static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }
}
