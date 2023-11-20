package lesson.lesson25.practice.third;

import java.util.List;

public class Some extends Thread {
    private final int id;

    public Some() {
        int a = Main.idCounter.getAndIncrement();
        this.id = ++a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Main.count1.addAndGet(id);
        }
    }
}
