package lesson.lesson28.practice.taski2;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Passenger implements Runnable {

    private final String name;
    private final CountDownLatch countDownLatch;

    public Passenger(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            Random random = new Random();
            int randomSec = random.nextInt(1_000, 10_001);
            Thread.sleep(randomSec);
            System.out.println("Passenger " + name + " in Terminal");
            Thread.sleep(randomSec);
            System.out.println("Passenger " + name + " gave his luggage and registered");
            Thread.sleep(randomSec);
            System.out.println("Passenger " + name + " passed Passport Control");
            Thread.sleep(randomSec);
            System.out.println("Passenger " + name + " passed Gate");
            Thread.sleep(randomSec);
            countDownLatch.countDown();
            countDownLatch.await();
            System.out.println("Passenger " + name + " departed. Departure Time: "
                    + ((System.currentTimeMillis() - start) / 1000));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
