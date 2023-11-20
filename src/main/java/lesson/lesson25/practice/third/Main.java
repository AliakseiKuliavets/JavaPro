package lesson.lesson25.practice.third;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger count1 = new AtomicInteger();
    static AtomicInteger idCounter = new AtomicInteger();

    public static void main(String[] args) {
        Some some1 = new Some();
        Some some2 = new Some();
        Some some3 = new Some();
        Some some4 = new Some();
        Some some5 = new Some();
        some1.start();
        some2.start();
        some3.start();
        some4.start();
        some5.start();
        try {
            some1.join();
            some2.join();
            some3.join();
            some4.join();
            some5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count1);
    }
}
