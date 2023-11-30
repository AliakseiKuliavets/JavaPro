package lesson.lesson28.practice.taski3;

import java.util.concurrent.Phaser;

public class Competitor implements Runnable {
    private final String name;
    private final int delayTime;
    private final Phaser phaser;

    public Competitor(String name, int delayTime,Phaser phaser) {
        this.name = name;
        this.delayTime = delayTime;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delayTime);
            System.out.println("Участник " + name + " приступил к соревнованию №1");
            Thread.sleep(delayTime);
            System.out.println("Участник " + name + " закончил к соревнованию №1");
            Thread.sleep(delayTime);
            phaser.arriveAndAwaitAdvance();
            System.out.println("Участник " + name + " приступил к соревнованию №2");
            Thread.sleep(delayTime);
            System.out.println("Участник " + name + " закончил к соревнованию №2");
            Thread.sleep(delayTime);
            phaser.arriveAndAwaitAdvance();
            System.out.println("Участник " + name + " приступил к соревнованию №3");
            Thread.sleep(delayTime);
            System.out.println("Участник " + name + " закончил к соревнованию №3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
