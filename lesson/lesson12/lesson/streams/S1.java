package lesson.lesson12.lesson.streams;

import java.util.Arrays;
import java.util.List;

public class S1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 456, 78, 9, 9, 9, 9, 8);
        int[] arr = {23, 4, 56, 78, 90};

        // list.stream(); // так для литста
        // Arrays.stream(arr); // так для массива
        //Create Stream -> intermediate methods -> terminal methods
        List<Integer> list1 = list.stream()
                .filter(digit -> digit % 2 == 0)
                .map(el -> el * 10)
                .toList();
        System.out.println(list1);

        List<Integer> list3 = list.stream()
                .distinct()         //уникальные значения
                .toList();
        System.out.println(list3);

        List<Integer> list4 = list.stream()
                .sorted()           // сортировка
                .toList();
        System.out.println(list4);

        List<Integer> list5 = list.stream()
                .filter(el -> el % 2 == 0)
                .sorted()
                .distinct()
                .toList();
        System.out.println(list5);
    }
}
