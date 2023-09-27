package homeWork._21;

import java.util.Map;

public class Bankir {
    private double moneyAccount;
    private String nameBankir;
    private Map<Integer, String> cardsBankir;

    public Bankir(double moneyAccount, String nameBankir, Map<Integer, String> cardsBankir) {
        this.moneyAccount = moneyAccount;
        this.nameBankir = nameBankir;
        this.cardsBankir = cardsBankir;
    }
}
