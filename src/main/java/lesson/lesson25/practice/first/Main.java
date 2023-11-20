package lesson.lesson25.practice.first;

public class Main {

    // Есть три цикла.
    // Первый цикл выводит в консоль числа от 0 до 9 с паузой в 300 мс.
    // Второй - числа от 100 до 109 с паузой в 200 мс.
    // Третий - числа от 10000 до 10009 с паузой в 500 мс.
    // Все три цикла должны работать одновременно (один из них в main-потоке).
    // Два остальных потока должны быть созданы разными способами.
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TH1());
        thread1.start();

        new Thread(() -> {
            for (int i = 10000; i <= 10009; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i + " -------------3--------------");
            }
        }).start();

        for (int i = 0; i <= 9; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " 1");
        }
    }
}
