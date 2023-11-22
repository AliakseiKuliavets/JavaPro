package lesson.lesson26.lesson;

public class Interruption {
    public static void main(String[] args) {
        System.out.println("Main Start");
        IThread t1 = new IThread();
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t1.interrupt();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main End");
    }
}

class IThread extends Thread {
    double digit = 0d;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("*****!******");
                System.out.println(digit);
                return;
            }
            digit += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Zzzz..............");
                System.out.println(digit);
            }

        }
    }
}
