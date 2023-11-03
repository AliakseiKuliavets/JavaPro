package homeWork._21;

public class Main {
    public static void main(String[] args) {
//        Cards cards = new Cards();
//        System.out.println(cards.createCards());
//        Bankir bankir = new Bankir(10_000,"Bankir", null,20);
//
        Gamer gamer1 = new Gamer("First", 1000, null,0);
//        List<Gamer> gamerList = new ArrayList<>();
//        gamerList.add(gamer1);
//
//        GameManagment gameManagment = new GameManagment(gamerList,bankir);
//        gameManagment.addCardGamer(gamer1);
//        System.out.println(gamer1);
        LogicGame logicGame = new LogicGame();
        logicGame.startGame(gamer1);
    }
}
