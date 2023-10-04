package lesson.lesson12.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 456, 78, 9, 9, 9, 9, 8);
        List<String> listString = Arrays.asList("1", "23", "456", "78", "9", "8");

        //: Фильтрация списка целых чисел на нечетные числа
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println("Список целых нечетные числа " + list1);

        // Преобразование списка строк в список чисел
        List<Integer> list2 = listString.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Cписка строк в список чисел " + list2);

        // Суммирование списка чисел
        AtomicInteger n = new AtomicInteger();
        list.forEach(n::addAndGet);
        System.out.println("Сумма всех элементов " + n);

        // Определение максимального значения в списке

    }
}
