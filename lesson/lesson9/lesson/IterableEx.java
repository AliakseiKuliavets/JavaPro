package lesson.lesson9.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("W");
        list.add("Z");
        list.add("Q");
        list.add("H");
        list.add("L");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
