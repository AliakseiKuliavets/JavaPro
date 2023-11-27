package lesson.lesson27.practice.task1;

public class Some {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("Alpha 1", 400);
        MyThread1 myThread2 = new MyThread1("Beta 2", 500);

        myThread1.start();
        myThread2.start();

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread.currentThread().setName("Main Thread");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
                System.out.printf("Thread: %s, выполнился %d раз %n", Thread.currentThread().getName(), i + 1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
