package homeWork._21;

import java.util.Map;

public class Gamer {
    private String name;
    private double moneyAccount;
    private Map<String, Integer> cardsMap;

    public Gamer(String name, double moneyAccount, Map<String, Integer> cardsMap) {
        this.name = name;
        this.moneyAccount = moneyAccount;
        this.cardsMap = cardsMap;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", moneyAccount=" + moneyAccount +
                ", cardsMap=" + cardsMap +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public Map<String, Integer> getCardsMap() {
        return cardsMap;
    }

    public void setCardsMap(Map<String, Integer> cardsMap) {
        this.cardsMap = cardsMap;
    }
}
