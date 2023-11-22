package lesson.lesson26.lesson;

public class DLock {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        TH1 T1 = new TH1();
        TH2 T2 = new TH2();

        T1.setName("T-1");
        T2.setName("T-2");

        T1.start();
        T2.start();
    }
}

class TH1 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Try to catch LOCK1");
        synchronized (DLock.LOCK1) {
            System.out.println(Thread.currentThread().getName() + " caught LOCK1");
            System.out.println(Thread.currentThread().getName() + " Try to catch LOCK2");
            synchronized (DLock.LOCK2) {
                System.out.println(Thread.currentThread().getName() + "  LOCK1 and LOCK2");
            }
        }
    }
}

class TH2 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Try to catch LOCK2");
        synchronized (DLock.LOCK2) {
            System.out.println(Thread.currentThread().getName() + " caught LOCK2");
            System.out.println(Thread.currentThread().getName() + " Try to catch LOCK1");
            synchronized (DLock.LOCK1) {
                System.out.println(Thread.currentThread().getName() + " LOCK2 and LOCK1");
            }
        }
    }
}