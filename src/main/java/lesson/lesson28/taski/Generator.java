package lesson.lesson28.taski;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Generator {
    private static final Random random = new Random();


    public List<Player> generator() {
        List<Player> playerList = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            Exchanger<Position> exchanger = new Exchanger<>();
            playerList.add(new Player(faker.name().name(), generatorPosition(), exchanger));
        }
        return playerList;
    }

    private List<Position> generatorPosition() {
        List<Position> list = new ArrayList<>();
        Position[] positions = {Position.PAPER, Position.SCISSORS, Position.STONE};
        for (int i = 0; i < 10; i++) {
            list.add(positions[random.nextInt(3)]);
        }
        return list;
    }
}
