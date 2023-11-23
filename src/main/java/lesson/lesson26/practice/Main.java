package lesson.lesson26.practice;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread1 = new Thread(() -> {
                System.out.print("А");
            });
            thread1.start();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread thread2 = new Thread(() -> {
                System.out.print("Б");
            });
            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread thread3 = new Thread(() -> {
                System.out.print("В");
            });
            thread3.start();
            try {
                thread3.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

