package lesson.lesson27.practice.task1;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(50);
                System.out.println("Отработал Daemon ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
