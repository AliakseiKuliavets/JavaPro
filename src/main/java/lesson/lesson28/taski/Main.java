package lesson.lesson28.taski;


import java.util.*;
import java.util.concurrent.Exchanger;


public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();

        List<Player> players = generator.generator();

        for (Player currentPlayer : players) {
            for (Player opponent : players) {
                if (!currentPlayer.equals(opponent)) {
                    List<Position> currentPlayerPositions = currentPlayer.getPositions();
                    List<Position> opponentPositions = opponent.getPositions();

                    for (int i = 0; i < currentPlayerPositions.size() && i < opponentPositions.size(); i++) {
                        currentPlayer.play(currentPlayerPositions.get(i), opponentPositions.get(i));
                    }
                }
            }
        }

        Map<Player, Double> playerScores = new HashMap<>();
        for (Player player : players) {
            playerScores.put(player, player.getWinCount());
        }

        List<Map.Entry<Player, Double>> sortedPlayers = new ArrayList<>(playerScores.entrySet());
        sortedPlayers.sort(Map.Entry.<Player, Double>comparingByValue().reversed());

        for (int i = 0; i < Math.min(3, sortedPlayers.size()); i++) {
            Map.Entry<Player, Double> entry = sortedPlayers.get(i);
            System.out.println("Player: " + entry.getKey().getFakerName() + " score: " + entry.getValue());
        }
    }
}
