package lesson.lesson3.task2;

import lesson.lesson3.task2.interfac.Transferable;

public class CreditAccount extends Account implements Transferable {

    private double creditLimit;

    public CreditAccount(String name, double creditLimit, double balance) {
        super(name, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void transfer(Account destination, double amount) {
        if (super.getBalance() - amount > creditLimit) {
            destination.setBalance(destination.getBalance() + amount);
            super.setBalance(super.getBalance() - amount);
        }
    }
}
