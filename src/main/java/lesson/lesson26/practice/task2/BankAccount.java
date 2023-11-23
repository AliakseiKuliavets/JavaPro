package lesson.lesson26.practice.task2;

public class BankAccount {
    private int amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void withdrawMoney(int money) {
        if (money > amount) {
            System.out.println("Недостаточно денег");
        }
        amount -= money;
    }

}
