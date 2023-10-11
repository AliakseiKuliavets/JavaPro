package lesson.lesson14;

import java.util.stream.Stream;

public class FibEx {
    public static long fibLoop(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }

        var fib1 = -1L;
        var fib2 = 1;

        for (int i = 0; i < index; i++) {
            var fibCurrent = fib1 + fib2;
            fib1 = fib2;
            fib2 = (int) fibCurrent;
        }
        return fib2;
    }

    public static long fibRec(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            return 0;
        }

        return index == 1 || index == 2 ? 1L : fibRec(index - 2) + fibRec(index - 1);
    }

    public static long fibStream(final int index){
       var result = Stream.iterate(new long[]{0,1} , arr -> new long[]{arr[1], arr[0] + arr[1]})
               .limit(index+1)
               .map(y -> y[0])
               .max(Long::compareTo);
       return result.orElseThrow(IllegalAccessError::new);
    }

    public static void main(String[] args) {
        int n = 50;
        long fibLoop = System.currentTimeMillis();
        fibLoop(n);
        long fibLoop2 = System.currentTimeMillis();
        System.out.println("Time1: " + (fibLoop2 - fibLoop));

        fibLoop = System.currentTimeMillis();
        fibRec(n);
        fibLoop2 = System.currentTimeMillis();
        System.out.println("Time2: " + (fibLoop2 - fibLoop));

        fibLoop = System.currentTimeMillis();
        fibStream(n);
        fibLoop2 = System.currentTimeMillis();
        System.out.println("Time3: " + (fibLoop2 - fibLoop));
    }
}
