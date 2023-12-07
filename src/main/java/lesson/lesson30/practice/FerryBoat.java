package lesson.lesson30.practice;

import java.util.Random;

public class FerryBoat implements Runnable {

    private final long start = System.currentTimeMillis();

    @Override
    public void run() {
        try {
            System.out.println("Паром отошел от берега");
            Thread.sleep(2000);
            System.out.println("Паром на другом берегу, прошло: " + ((System.currentTimeMillis() - start) / 1000)
                    + " секунд");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
