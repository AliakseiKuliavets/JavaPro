package lesson.lesson28.semaphorEx;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        new Person("Bogdan", semaphore);
        new Person("Aliaksei", semaphore);
        new Person("Alexander", semaphore);
        new Person("Tatiana", semaphore);
        new Person("Vasily", semaphore);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println("[ " + name + " ] is waiting for.......");
            semaphore.acquire(); // отсчет до 0 (на вход 5 - 3) - 2 будут ждать пока не откроют release()
            sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release(); // что бы открыть заново 3 потока
            System.out.println("[ " + name + " ] is Accepted");
        }
    }
}
