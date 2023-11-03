package lesson.lesson13.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("AAA", "aaa", "AAaa", "aaaAAA");

        List<String> list = stringList.stream()
                .limit(3)
                .toList();
        System.out.println(list);

        stringList.stream()
                .anyMatch(el -> el.length() < 8);

        Optional<String> first = stringList.stream()
                .findFirst();

        List<List<Integer>> listList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8)
        );
    }
}
