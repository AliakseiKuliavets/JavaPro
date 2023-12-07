package lesson.lesson30.practice2;

import java.util.List;
import java.util.Random;

public class Courier implements Runnable {
    private final String start;
    private final String destination;
    private final List<Package> packageList;
    private Courier anotherCourier;
    private boolean inExchangePoint;

    public Courier(String start, String destination, List<Package> packageList) {
        this.start = start;
        this.destination = destination;
        this.packageList = packageList;
    }

    public void setAnotherCourier(Courier anotherCourier) {
        this.anotherCourier = anotherCourier;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int randomTime = random.nextInt(1_000, 10_001);

            Thread.sleep(randomTime);
            System.out.println(this + " выехал из точки " + start);

            Thread.sleep(randomTime);
            System.out.println(this + " доехал до пункта обмена ");

            Thread.sleep(randomTime);
            System.out.println(this + " уехал из пункта обмена ");

            Thread.sleep(randomTime);
            System.out.println(this + " доехал до пункта выгрузки " + destination);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Courier: " + start + " -> " + destination;
    }
}
