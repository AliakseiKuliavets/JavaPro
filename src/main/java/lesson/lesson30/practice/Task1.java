package lesson.lesson30.practice;

import com.github.javafaker.Faker;

import java.util.concurrent.CyclicBarrier;

public class Task1 {
    private final static Faker FAKER = new Faker();
    private final static FerryBoat FERRY_BOAT = new FerryBoat();
    private static final CyclicBarrier CYCLIC_BARRIER = new CyclicBarrier(2,FERRY_BOAT);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Track track = new Track(CYCLIC_BARRIER,FAKER.color().name());
            Thread thread = new Thread(track);
            thread.start();
        }
    }
}
