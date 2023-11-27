package lesson.lesson27.practice.task1;

public class MyThread1 extends Thread {
    private int millis;

    public MyThread1(String name, int millis) {
        setName(name);
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(millis);
                System.out.printf("Thread: %s, выполнился %d раз %n", getName(), i + 1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
