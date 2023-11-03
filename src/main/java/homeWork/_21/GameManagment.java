package homeWork._21;

import java.util.*;

public class GameManagment {
    private List<Gamer> gamerList;
    private final Bankir bankir;

    public GameManagment(List<Gamer> gamerList, Bankir bankir) {
        this.gamerList = gamerList;
        this.bankir = bankir;
    }

    public List<Gamer> getGamerList() {
        return gamerList;
    }

    public Bankir getBankir() {
        return bankir;
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

    public int winOrLost() {
       List<Integer> list = new ArrayList<>();
        int n = 0;
        for (Gamer gamer : gamerList) {
            Map<String, Integer> cardsMap = gamer.getCardsMap();
            if (cardsMap != null) {
                for (Integer value : cardsMap.values()) {
                    list.add(value);
                    for (Integer integer : list) {
                        n += integer;
                        gamer.setNumberWin(n);
                    }
                }
            }
        }

        if (n == 21) {
            return 0;
        } else if (n > 21) {
            return 1;
        } else {
            return -1;
        }
    }
}
