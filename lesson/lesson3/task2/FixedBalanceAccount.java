package lesson.lesson3.task2;

import lesson.lesson3.task2.interfac.Transferable;

public class FixedBalanceAccount extends Account implements Transferable {
    private String numberAccount;
    private double balanceAccount;


    public FixedBalanceAccount(String numberAccount, double balanceAccount) {
        this.numberAccount = numberAccount;
        this.balanceAccount = balanceAccount;
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
