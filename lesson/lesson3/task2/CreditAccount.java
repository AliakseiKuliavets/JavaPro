package lesson.lesson3.task2;

import lesson.lesson3.task2.interfac.Transferable;

public class CreditAccount extends Account implements Transferable {

    private double creditLimit;

    public CreditAccount(String name, double creditLimit, double balance) {
        super(name, balance);
        if (balance < 0) {
            this.creditLimit = creditLimit;
        }
    }

    @Override
    public void transfer(Account destination, double amount) {
        if ((super.getBalance()  <= creditLimit)) {
            super.getBalance();
        } else {
            super.setBalance(super.getBalance() - amount);
            destination.setBalance(destination.getBalance() + amount);
        }
    }
}
