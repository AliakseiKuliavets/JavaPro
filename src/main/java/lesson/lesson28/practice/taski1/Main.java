package lesson.lesson28.practice.taski1;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Car("Red", semaphore);
        new Car("Green", semaphore);
        new Car("Yellow", semaphore);
        new Car("Black", semaphore);
        new Car("Purple", semaphore);
    }
}
