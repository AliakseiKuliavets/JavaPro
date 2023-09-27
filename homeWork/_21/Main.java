package homeWork._21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cards cards = new Cards();
        System.out.println(cards.createCards());
        Bankir bankir = new Bankir(10_000,"Bankir", null);

        Gamer gamer1 = new Gamer("First", 1000, null);
        Gamer gamer2 = new Gamer("Second", 2000, null);
        List<Gamer> gamerList = new ArrayList<>();
        gamerList.add(gamer1);
        gamerList.add(gamer2);

        GameManagment gameManagment = new GameManagment(gamerList,bankir);
        gameManagment.addCardGamer(gamer1);
        System.out.println(gamer1);
    }
}
