package lesson.lesson25.practice.second;

public class NEX1 implements Runnable{
    private final Main main;

    public NEX1(Main main) {
        this.main = main;
    }

    @Override
    public void run() {
        main.countIncr();
    }
}
