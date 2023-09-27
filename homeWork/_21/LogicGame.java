package homeWork._21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicGame {
    private GameManagment createGame() {
        Bankir bankir = new Bankir(10_000, "Bankir", null,5);

        Gamer gamer1 = new Gamer("First", 1000, null,0);
        List<Gamer> gamerList = new ArrayList<>();
        gamerList.add(gamer1);
        return new GameManagment(gamerList, bankir);
    }

    public void startGame(Gamer gamer) {
        System.out.println("Welcome to 21 game:");
        System.out.println("Что бы начать игру нажмите 1");
        System.out.println("Что бы прочесть правила игры нажмите Q");
        System.out.println("Что бы выйти нажмите F");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine().toUpperCase();
        switch (start) {
            case "F" -> startGame(gamer);
            case "Q" -> readTextDocument("text21.txt");
            case "1" -> {
                createGame();
                gameProcess(gamer);
            }
        }
        startGame(gamer);
    }

    private void endGame(Gamer gamer) {
        System.out.println("Что бы выйти нажмите F");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        if (s.equals("F")) {
            startGame(gamer);
        }
    }

    private void gameProcess(Gamer gamer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите посмтореть ваш баланс нажмите 1");
        System.out.println("Хотите посмотреть ваши карты нажмите 2");
        System.out.println("Хотите взять карту нажмите 3");
        System.out.println("Хотите сделать ставку нажмите 4");
        System.out.println("Что бы проверить выграли ли вы нажмите 5");
        System.out.println("Что бы выйти нажмите F");
        String s = scanner.nextLine().toUpperCase();
        switch (s) {
            case "F" -> startGame(gamer);
            case "1" -> serachBalance(gamer);
            case "2" -> searchCards(gamer);
            case "3" -> addCards(gamer);
            case "5" -> winOrLostSearch(gamer);
        }
        gameProcess(gamer);
    }

    private void serachBalance(Gamer gamer) {
        System.out.println(gamer.getMoneyAccount());
    }

    private void searchCards(Gamer gamer) {
        System.out.println(gamer.getCardsMap());
    }

    private void addCards(Gamer gamer) {
        createGame().addCardGamer(gamer);
    }
    private void winOrLostSearch(Gamer gamer) {
        int numberBankin = createGame().getBankir().getNumber();
        int n = createGame().winOrLost();
        if (n == 0) {
            System.out.println("You win");
        } else if (n == 1) {
            System.out.println("You lost");
        } else if (n == -1) {
            if (numberBankin >= gamer.getNumberWin() && numberBankin == 21) {
                System.out.println("You lost");
            } else {
                System.out.println("You win");
            }
        }
        resetCardGamer(gamer);
    }
    private void resetCardGamer(Gamer gamer) {
        gamer.setCardsMap(null);
    }
    private  void readTextDocument(String filePath) {
        try(FileReader reader = new FileReader(filePath))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
