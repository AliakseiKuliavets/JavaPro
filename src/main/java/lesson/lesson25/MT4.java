package lesson.lesson25;


public class MT4 extends Thread {
    volatile boolean b = true; // запрещаем потоку кешировать

    @Override
    public void run() {
        long count = 0;
        while (b) {
            count++;
        }
        System.out.println("Counter: " + count);
    }


    public static void main(String[] args) {
        MT4 mt4 = new MT4();
        mt4.start();

        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Wake UP!");

        mt4.b = false;

        try {
            mt4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main End");
    }
}
