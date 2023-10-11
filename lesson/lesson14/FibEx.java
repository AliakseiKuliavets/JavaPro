package lesson.lesson14;

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
}
