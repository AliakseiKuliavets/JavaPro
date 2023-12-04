package lesson.lesson29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHMAP {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Mik", 1);
        map.put("Ni", 2);
        map.put("Ol", 3);
        map.put("Sv", 4);
        map.put("Ser", 5);

        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String s = iterator.next();
                System.out.println("Run I: " + map.get(s));
            }
        };
        Runnable runnable2 = () -> {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put("CCC", 6);
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(map);
    }
}
