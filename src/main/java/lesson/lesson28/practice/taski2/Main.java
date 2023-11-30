package lesson.lesson28.practice.taski2;

import com.github.javafaker.Faker;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static final Faker faker = new Faker();
    private static final CountDownLatch countDownLatch = new CountDownLatch(5);

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(faker.name().name(), countDownLatch);
        Passenger passenger2 = new Passenger(faker.name().name(), countDownLatch);
        Passenger passenger3 = new Passenger(faker.name().name(), countDownLatch);
        Passenger passenger4 = new Passenger(faker.name().name(), countDownLatch);
        Passenger passenger5 = new Passenger(faker.name().name(), countDownLatch);
        Thread thread1 = new Thread(passenger1);
        Thread thread2 = new Thread(passenger2);
        Thread thread3 = new Thread(passenger3);
        Thread thread4 = new Thread(passenger4);
        Thread thread5 = new Thread(passenger5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
