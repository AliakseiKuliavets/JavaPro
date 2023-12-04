package lesson.lesson29;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomi {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void inc() {
        counter.addAndGet(2);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRun());
        Thread t2 = new Thread(new TaskRun());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }
}

class TaskRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            Atomi.inc();
        }
    }
}