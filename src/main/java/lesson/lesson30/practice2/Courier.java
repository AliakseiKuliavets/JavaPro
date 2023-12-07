package lesson.lesson30.practice2;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Courier implements Runnable {
    private final String start;
    private final String destination;
    private final List<Package> packageList;
    private Courier anotherCourier;
    private boolean inExchangePoint;
    private Exchanger<Package> exchanger;

    public Courier(String start, String destination, List<Package> packageList, Exchanger<Package> exchanger) {
        this.start = start;
        this.destination = destination;
        this.packageList = packageList;
        this.exchanger = exchanger;
    }

    public void setAnotherCourier(Courier anotherCourier) {
        this.anotherCourier = anotherCourier;
    }

    private void unload() {
        Iterator<Package> iterator = packageList.iterator();
        while (iterator.hasNext()) {
            Package p = iterator.next();
            if (p.getAddressOfArrive().equals(destination)) {
                System.out.println(this + " успешно доставил " + p);
                iterator.remove();
            }
        }
        if (!packageList.isEmpty()) {
            System.out.println(this + " доставил не все посылки ");
        } else {
            System.out.println(this + " доставил все посылки ");
        }
    }

    private Package getAnotPackage() {
        Iterator<Package> iterator = packageList.iterator();
        while (iterator.hasNext()) {
            Package p = iterator.next();
            if (!p.getAddressOfArrive().equals(destination)) {
                iterator.remove();
                System.out.println(this + " передал " + p + " другому курьеру");
                return p;
            }
        }
        return null;
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
//            inExchangePoint = true;
//            if (anotherCourier.inExchangePoint) {
//                packageList.add(anotherCourier.aPackage());
//            }

            packageList.add(exchanger.exchange(getAnotPackage()));
            Thread.sleep(randomTime);
//            if (anotherCourier.inExchangePoint) {
//                packageList.add(anotherCourier.aPackage());
//            }
//            inExchangePoint = false;
            System.out.println(this + " уехал из пункта обмена ");

            Thread.sleep(randomTime);
            System.out.println(this + " доехал до пункта выгрузки " + destination);
            Thread.sleep(randomTime);
            unload();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Courier: " + start + " -> " + destination;
    }
}
