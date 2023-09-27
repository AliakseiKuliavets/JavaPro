package homeWork._21;

import java.util.Map;

public class Bankir {
    private double moneyAccount;
    private String nameBankir;
    private Map<Integer, String> cardsBankir;
    private int number;

    public Bankir(double moneyAccount, String nameBankir, Map<Integer, String> cardsBankir, int number) {
        this.moneyAccount = moneyAccount;
        this.nameBankir = nameBankir;
        this.cardsBankir = cardsBankir;
        this.number = number;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public String getNameBankir() {
        return nameBankir;
    }

    public Map<Integer, String> getCardsBankir() {
        return cardsBankir;
    }

    public int getNumber() {
        return number;
    }
}
