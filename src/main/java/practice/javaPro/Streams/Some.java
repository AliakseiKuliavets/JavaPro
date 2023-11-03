package practice.javaPro.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Some {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Privet", "Kak dela", "Okey", "Poka");

//        for (int i = 0 ; i < stringList.size(); i++) {
//            stringList.set(i, String.valueOf(stringList.get(i).length()));
//        }
        System.out.println(stringList);

        List<Integer> list = stringList.stream()
                .map(el -> el.length())
                .toList();
        System.out.println(list);

        int[] array = {5, 9, 3, 8, 1};
        int[] array1 = Arrays.stream(array)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                })
                .toArray();
        System.out.println(Arrays.toString(array1));

        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Kak");
        set.add("Okey");
        set.add("Pokaa");

        Set<Integer> collect = set.stream()
                .map(el -> el.length())
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
