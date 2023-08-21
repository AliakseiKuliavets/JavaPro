package practice.some.Algoritms;

import java.util.HashMap;

public class HashMapSearchIndexO1 {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 4, 5};
        System.out.println(searchIndex(array, 3));
    }

    private static int searchIndex(int[] array, int number) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        if (map.containsKey(number)) {
            return map.get(number);
        }

        return -1;
    }
}
