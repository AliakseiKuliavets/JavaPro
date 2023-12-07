package lesson.lesson30.practice;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Track implements Runnable {

    private final CyclicBarrier barrier;
    private final String name;

    public Track(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        for (int i = 0; i < 2; i++) {
            try {
                Random random = new Random();
                int rand = random.nextInt(1_000, 10_001);
                System.out.println("Грузовик " + Thread.currentThread().getName() + " подьехал к переправе");
                Thread.sleep(rand);
                barrier.await();
                System.out.println("Грузовик " + Thread.currentThread().getName() + " достиг другого берега");
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
