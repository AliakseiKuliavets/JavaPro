package lesson.lesson28.practice.taski3;

import java.util.concurrent.Phaser;

public class Main {
    private static final Phaser PHASER = new Phaser();

    public static void main(String[] args) {
        Competitor c1 = new Competitor("Name 1", 1000, PHASER);
        Competitor c2 = new Competitor("Name 2", 2000, PHASER);
        Competitor c3 = new Competitor("Name 3", 1500, PHASER);

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
    }
}
