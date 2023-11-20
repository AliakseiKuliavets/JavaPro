package lesson.lesson25.practice.first;

public class TH1 implements Runnable{
    public void m1() {
        for (int i = 100; i <= 109; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "  !!!!!!!!!! ");
        }
    }

    @Override
    public void run() {
        m1();
    }
}
