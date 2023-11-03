package lesson.lesson19.Lesson19;

import java.util.ArrayList;
import java.util.List;

public class Unit1 {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public List<Integer> getOnlyEven(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException();
        }

        List<Integer> evenList = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }
}
