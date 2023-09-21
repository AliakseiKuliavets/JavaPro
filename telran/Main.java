package telran;

import telran.bank.entity.Manager;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println(str.replace("-",""));

        Manager manager1 = new Manager();
        System.out.println(manager1);

        Manager manager2 = new Manager();
        System.out.println(manager2);

        System.out.println(manager1.equals(manager2));

;

    }
}