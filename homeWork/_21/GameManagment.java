package homeWork._21;

import java.util.*;

public class GameManagment {
    private List<Gamer> gamerList;
    private final Bankir bankir;

    public GameManagment(List<Gamer> gamerList, Bankir bankir) {
        this.gamerList = gamerList;
        this.bankir = bankir;
    }

    public void addCardGamer(Gamer gamer) {
        Cards cards = new Cards();
        List<String> list = new ArrayList<>(cards.createCards().keySet());

        Map<String, Integer> hashMap = new HashMap<>();
        if (gamer.getCardsMap() != null) {
            hashMap.putAll(gamer.getCardsMap());
        }

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        String randomKey = list.get(randomIndex);
        Integer randomValue = cards.createCards().get(randomKey);


        int currentIndex = 0;
        for (Map.Entry<String, Integer> entry : cards.createCards().entrySet()) {
            if (currentIndex == randomIndex) {
                randomKey = entry.getKey();
                randomValue = entry.getValue();
            }
            currentIndex++;
        }

        if (randomKey != null && randomValue != null) {
            hashMap.put(randomKey, randomValue);
        }
        gamer.setCardsMap(hashMap);
    }

}
