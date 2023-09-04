package lesson.lesson3.task2;

import lesson.lesson3.task2.interfac.Transferable;

public class CreditAccount extends Account implements Transferable {
    private String numberAccount;
    private double balanceAccount;
    private double limitBalanceAccount;

    public CreditAccount(String numberAccount, double limitBalanceAccount, double balanceAccount) {
        this.numberAccount = numberAccount;
        this.balanceAccount = balanceAccount;
        this.limitBalanceAccount = limitBalanceAccount;
    }

    @Override
    void account() {

    }

    @Override
    public double transfer(Account destination, double amount) {
        return balanceAccount + amount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }
}
