package lesson.lesson29;

import java.util.ArrayList;
import java.util.List;

public class SynchCollEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        List<Integer> target = new ArrayList<>();
        Thread th1 = new Thread(() ->
                target.addAll(list)
        );

        Thread th2 = new Thread(() ->
                list.addAll(target)
        );

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);
    }
}
