package lesson.lesson7._2023_09_18;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(21, "John");
        map.put(22, "Yurii");
        map.put(24, "Mik");
        map.put(3, "Nik");
        map.put(1, "Anna");
        map.put(null, "NN");
        map.put(2, "Jane");
        map.put(2, "Jane1");
        map.put(2, "Jane2");
        map.put(2, "Jane33");

//        System.out.println(map);
//        System.out.println(map.get(28));
//        System.out.println(map.get(22));
//        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
