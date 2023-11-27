package lesson.lesson27.practice.task2;

public class Bow {
    private int arrows = 10;

    public synchronized void shotTarget() {
        while (arrows > 0) {
            try {
                Thread.sleep(1000);
                arrows--;
                System.out.println("Был произведен выстрел");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Стрелы закончились");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Стрелы в колчан были добавлены");
    }

    public synchronized void addArrows() {
        notify();
        arrows += 10;
        System.out.println("В колчан было добавлено 10 стрел");
    }
}
