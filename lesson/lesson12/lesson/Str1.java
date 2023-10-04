package lesson.lesson12.lesson;

import java.util.Arrays;
import java.util.List;

public class Str1 {
    public static void main(String[] args) {
        List<String> listName = Arrays.asList("Q", "W", "S", "X");
        listName.forEach(el -> System.out.println(el));
        listName.forEach(System.out::println);
    }
}
