package lesson.lesson25;

public class MT1 {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        TH1 th1 = new TH1();
        TH2 th2 = new TH2();

        th1.setName("TH1");
        th2.setName("TH2");

        // th1.setPriority(); // приоритет потока

        System.out.println("Name 1 " + th1.getName() + " PRIORITY " + th1.getPriority());
        System.out.println("Name 2 " + th2.getName() + " PRIORITY " + th2.getPriority());

        th1.start();
        th2.start();

        try {
            th1.join(); // ждать пока не дождется конца выполнения th1.start() // join(int сколько ждать секунд)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("MAIN END");
    }
}

class TH1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TH1: " + i + " ***");
        }
    }
}

class TH2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("TH2: " + i + " -------------");
        }
    }
}
