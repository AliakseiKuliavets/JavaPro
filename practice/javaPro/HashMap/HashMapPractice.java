package practice.javaPro.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "AA");
        map1.put(2000, "AB");
        map1.put(3000, "AC");
        map1.put(4000, "AD");
        map1.put(5000, "AF");
        map1.put(6000, "AG");
        map1.putIfAbsent(1000,"ABC");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.containsValue("AB"));
        System.out.println(map1.get(1001));
        map1.remove(1000);
        System.out.println(map1);
    }
}
