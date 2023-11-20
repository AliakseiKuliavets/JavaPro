package lesson.lesson25;

public class MT1 {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        TH1 th1 = new TH1();
        TH2 th2 = new TH2();

        th1.start();
        th2.start();
        System.out.println("MAIN END");
    }
}

class TH1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("TH1: " + i + " ***");
        }
    }
}

class TH2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("TH2: " + i + " -------------");
        }
    }
}
