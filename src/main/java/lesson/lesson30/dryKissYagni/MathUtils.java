package lesson.lesson30.dryKissYagni;

import java.util.Arrays;
import java.util.List;

public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}

class MathUtils2 {
    public static int calculateSum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}