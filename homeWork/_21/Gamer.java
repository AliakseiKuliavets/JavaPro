package homeWork._21;

import java.util.Map;

public class Gamer {
    private String name;
    private double moneyAccount;
    private Map<String, Integer> cardsMap;
    private int numberWin;

    public Gamer(String name, double moneyAccount, Map<String, Integer> cardsMap,int numberWin) {
        this.name = name;
        this.moneyAccount = moneyAccount;
        this.cardsMap = cardsMap;
        this.numberWin = numberWin;
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

    public int getNumberWin() {
        return numberWin;
    }

    public void setNumberWin(int numberWin) {
        this.numberWin = numberWin;
    }
}
