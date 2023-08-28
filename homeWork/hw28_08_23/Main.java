package homeWork.hw28_08_23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, -34, 5, 6, -78, 9, 98, 76, -5, 43, 2, 12, -34, 56, -7, 8, 9};

        // 1. Найти среднее арифметическое положительных элементов массива.
        // простой метод findAvg() нахождения среднеариметического значения перебора каждого элемента массива
        System.out.println(new Main().findAvg(array));

        /* метод anotherFindAvf( )который сразу сортирует массив ,
          потом с послднего элемента шагаю и проверяю если элемент больше 0
          потом нахожу среднее значение
        */
//        System.out.println(new Main().anotherFindAvf(array));

        // 2. Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
        System.out.println(new Main().sumElements(array));

        // 3. Найти в массиве наибольшую сумму подряд идущих элементов
        // понял задачу так , что нужно искать парами  :)
        System.out.println(new Main().sumMaxValuesPairs(array));
    }

    private int findAvg(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int count = 0;
        int sumPositive = 0;
        for (int j : array) {
            if (j > 0) {
                sumPositive = sumPositive + j;
                count++;
            }
        }
        return sumPositive / count;
    }

    private int anotherFindAvf(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        Arrays.sort(array);

        int count = 0;
        int sumPositive = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= 0) {
                sumPositive = sumPositive + array[i];
                count++;
            }
        }
        return sumPositive / count;
    }

    private int sumElements(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int sumElem = 0;
        for (int j : array) {
            if (j % 3 == 0 && j % 5 != 0) {
                sumElem = sumElem + j;
            }
        }
        return sumElem;
    }

    private int sumMaxValuesPairs(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i] + array[i+1]) {
                max = array[i] + array[i+1];
            }
        }
        return max;
    }
}
