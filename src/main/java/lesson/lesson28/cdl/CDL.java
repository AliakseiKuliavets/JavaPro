package lesson.lesson28.cdl;

import com.github.javafaker.Faker;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static Faker faker = new Faker();

    public static void turnOn() throws InterruptedException {
        Thread.sleep(800);
        System.out.println("Turn ON");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    public static void uploadData() throws InterruptedException {
        System.out.println("Data is uploading...........");
        Thread.sleep(1800);
        System.out.println("Data was upload");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    public static void showGUI() throws InterruptedException {
        Thread.sleep(2800);
        System.out.println("System ready to work");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    public static void main(String[] args) {
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        new ITUser(faker.name().firstName(), countDownLatch);
        try {
            CDL.turnOn();
            CDL.uploadData();
            CDL.showGUI();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ITUser extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public ITUser(String name, CountDownLatch countDownLatch) {
        start();
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println("User: " + name + " has started work");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
