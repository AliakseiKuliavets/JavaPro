package lesson.lesson27.practice.task3;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.setName("Alfa");
        myThread2.setName("Beta");
        myThread3.setName("Gamma");
        myThread1.start();
        try {
            myThread1.join(2000);
            myThread2.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            myThread1.join();
            myThread3.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Все потоки отработают");
    }
}
