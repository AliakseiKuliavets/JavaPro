package lesson.lesson25.practice.second;


public class Main {
    // Есть общая целочисленная переменная (счётчик).
    // Есть три потока - главный и два побочных.
    // Каждый поток должен инкрементировать общую переменную 1 миллион раз.
    // После этого вывести в консоль значение переменной (ожидаемое значение - 3 000 000).
    private static int count = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.countIncr();

        Thread thread1 = new Thread(main::countIncr);
        Thread thread2 = new Thread(new NEX1(main));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }

    public synchronized void countIncr() {
        for (int i = 1; i <= 1_000_000; i++) {
            count++;
        }
    }
}
