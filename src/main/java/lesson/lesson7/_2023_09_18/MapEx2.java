package lesson.lesson7._2023_09_18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 65, 8, 7, 9, 2, 16);
        for (Integer i : list) {
            System.out.println("List Element: " + i);
        }

        int[] arr = {9, 87, 65, 4, 3, 2, 7, 4, 48};
        for (int a : arr) {
            System.out.println("ARR EL: " + a);
        }

        Map<String, String> map = new HashMap<>();
        map.put("+34123456", "Mik");
        map.put("+34123457", "Nik");
        map.put("+34123458", "Jane");
        map.put("+34123459", "Paul");
        map.put("+34123460", "Anna");
        map.put("+34123461", "Alla");
        map.put("+34123462", "Vera");

        //пары смотрим
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " | " + " Val: " + m.getValue());
        }

        //по ключам
        for (String s : map.keySet()) {
            System.out.println("Map keys: " + s);
        }

        //по значению
        for (String s : map.values()) {
            System.out.println("Map values: " + s);
        }
    }
}