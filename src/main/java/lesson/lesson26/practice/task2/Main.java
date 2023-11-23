package lesson.lesson26.practice.task2;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(2000);
        Client client1 = new Client(bankAccount1, "John");
        Client client2 = new Client(bankAccount1, "Pit");
        client1.start();
        client2.start();
        try {
            client1.join();
            client2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(bankAccount1.getAmount());
    }
}
