package lesson.lesson30.dryKissYagni;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DAta {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }

}

class Data1 {
    public double calculatorAvg(List<Double> numbers, boolean sqrt) {
        double avg = numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        return sqrt ? Math.sqrt(avg) : avg;
    }
    //Найдите факториал заданного числа.
    // (На вход допустим: 5 на выход: 120 {1 * 2 * 3 * 4 * 5})

    //Свяжи два массива
    // (На вход массив {3,2,8,1} и массив {0,1,0,3,12}, верни массив {3,2,8,1,0,1,0,3,12})

    //Свяжи два массива и отсортируй
    // (На вход массив {3,2,8,1} и массив {0,1,0,3,12}, верни массив {0,0,1,1,2,3,3,8,12})
    // попробуй со встроенными методом в джаве он есть погугли )))

    //Поиск элемента в массиве и вывод его под индексом (На вход массив
    // {3,2,8,1} и число 2 вернуть 1)

    //Найти индексы в массиве (2 шт.) которые дают в сумме число k и вывести их
    // (На вход массив {3,2,8,1} и число 9 вернуть массив {2,3})

    //Свяжи два массива и отсортируй
    // (На вход массив {3,2,8,1} и массив {0,1,0,3,12}, верни массив {0,0,1,1,2,3,3,8,12})
    // используя сортировку пузырьком

    //Переместить все 0 в конец массива и при этом сохранить последовательность других чисел
    // (На вход массив {0,1,0,3,12} вернуть массив {1,3,12,0,0})
}

