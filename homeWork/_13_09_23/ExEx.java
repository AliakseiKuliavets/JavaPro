package homeWork._13_09_23;

import java.util.List;

public class ExEx {
    //Уровень сложности 5 из 10:

    //Найти сумму всех элементов ArrayList<Integer>.
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }

    //Найти среднее значение элементов LinkedList<Integer>.
    public int getAvg(List<Integer> list) {
        int count = 0;
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
            count++;
        }
        return sum / count;
    }

    // Перебрать ArrayList<String> и вывести все элементы на экран.


}
