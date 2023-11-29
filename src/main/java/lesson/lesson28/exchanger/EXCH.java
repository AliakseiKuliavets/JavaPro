package lesson.lesson28.exchanger;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class EXCH {
    private static final Faker faker = new Faker();

    public static void main(String[] args) {
        Exchanger<Position> exchanger = new Exchanger<>();

        List<Position> mainPlayerList = new ArrayList<>();
        mainPlayerList.add(Position.SCISSORS);
        mainPlayerList.add(Position.STONE);
        mainPlayerList.add(Position.SCISSORS);
        mainPlayerList.add(Position.PAPER);
        mainPlayerList.add(Position.SCISSORS);

        List<Position> anotherPlayerList = new ArrayList<>();
        anotherPlayerList.add(Position.STONE);
        anotherPlayerList.add(Position.PAPER);
        anotherPlayerList.add(Position.SCISSORS);
        anotherPlayerList.add(Position.STONE);
        anotherPlayerList.add(Position.PAPER);

        new Player("Aliaksei", mainPlayerList, exchanger);
        new Player("Bogdan", anotherPlayerList, exchanger);
    }
}

enum Position {
    STONE,
    SCISSORS,
    PAPER
}

class Player extends Thread {
    private String name;
    private List<Position> positions;
    private Exchanger<Position> exchanger;

    public Player(String name, List<Position> positions, Exchanger<Position> exchanger) {
        this.name = name;
        this.positions = positions;
        this.exchanger = exchanger;
        start();
    }

    private void play(Position mainPlayer, Position anotherPlayer) {
        if (mainPlayer == Position.PAPER && anotherPlayer == Position.STONE ||
                mainPlayer == Position.STONE && anotherPlayer == Position.SCISSORS ||
                mainPlayer == Position.SCISSORS && anotherPlayer == Position.PAPER) {
            System.out.println("***[ " + name + " ]: Winner");
        }
    }

    @Override
    public void run() {
        Position reply;
        for (Position p :positions){
            try {
                reply = exchanger.exchange(p);
                play(p,reply);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
