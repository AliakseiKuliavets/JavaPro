package lesson.lesson25;

public class DataRaceEx {
    public static void main(String[] args) {
        THDR thdr = new THDR();
        Thread thread1 = new Thread(thdr);
        Thread thread2 = new Thread(thdr);
        Thread thread3 = new Thread(thdr);

        thread1.setName("TH1");
        thread2.setName("TH2");
        thread3.setName("TH3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class THDR implements Runnable {

    public void incr() {
        synchronized (this) { // если метод static то THDR.class
            Counter.count++;
            System.out.println("Counter: " + Counter.count);
        }
        System.out.println(" Name: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            incr();
        }
    }
}
