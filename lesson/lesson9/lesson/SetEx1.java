package lesson.lesson9.lesson;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(232);
        integerList.add(12);
        integerList.add(53);
        integerList.add(12);
        integerList.add(342);

        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(52);
        set.add(54);
        set.add(55);
        set.add(5);
        set.add(52);
        set.add(54);
        set.add(51);

        System.out.println(set);
    }
}
