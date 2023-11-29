package lesson.lesson28.taski;


import java.util.List;
import java.util.Objects;
import java.util.concurrent.Exchanger;

public class Player extends Thread {
    private final String name;
    private final List<Position> positions;
    private final Exchanger<Position> exchanger;

    private  double winCount = 0;

    public Player(String name, List<Position> positions, Exchanger<Position> exchanger) {
        this.name = name;
        this.positions = positions;
        this.exchanger = exchanger;
        start();
    }

    public void play(Position mainPlayer, Position anotherPlayer) {
        if ((mainPlayer == Position.PAPER && anotherPlayer == Position.STONE) ||
                (mainPlayer == Position.STONE && anotherPlayer == Position.SCISSORS) ||
                (mainPlayer == Position.SCISSORS && anotherPlayer == Position.PAPER)) {
            winCount += 1;
        } else if (mainPlayer == anotherPlayer) {
            winCount += 0.5;
        } else {
            winCount -= 1;
        }
    }

    @Override
    public void run() {
        Position reply;
        for (Position p : positions) {
            try {
                reply = exchanger.exchange(p);
                play(p, reply);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public String getFakerName() {
        return this.name;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public double getWinCount() {
        return winCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Double.compare(winCount, player.winCount) == 0 && Objects.equals(name, player.name) && Objects.equals(positions, player.positions) && Objects.equals(exchanger, player.exchanger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, positions, exchanger, winCount);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", positions=" + positions +
                ", exchanger=" + exchanger +
                ", winCount=" + winCount +
                '}';
    }
}
