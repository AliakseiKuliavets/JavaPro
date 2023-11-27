package lesson.lesson27.practice.task3;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.printf("Поток %s начал работу %n", getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Поток %s закончил работу %n", getName());
    }
}
