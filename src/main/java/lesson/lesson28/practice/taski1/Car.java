package lesson.lesson28.practice.taski1;

import java.util.concurrent.Semaphore;

public class Car extends Thread {
    private Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.semaphore = semaphore;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Auto " + getName() + " in start");
            sleep(1000);
            System.out.println("Auto " + getName() + " starting");
            long start = System.currentTimeMillis();
            sleep(1500);
            System.out.println("Auto " + getName() + " near tunnel");
            sleep(200);
            semaphore.acquire();
            System.out.println("Auto " + getName() + " in tunnel");
            sleep(2000);
            System.out.println("Auto " + getName() + " left from tunnel");
            semaphore.release();
            sleep(2000);
            System.out.println("Auto " + getName() + " finished " +
                    " Time: " + ((System.currentTimeMillis() - start) / 1000) + " second");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
