package lesson.lesson26.practice.task2;

public class Client extends Thread {
    private BankAccount bankAccount;

    public Client(BankAccount bankAccount, String name) {
        this.bankAccount = bankAccount;
        setName(name);
    }

    @Override
    public void run() {
        int sum = 1500;
        try {
            Thread.sleep(3000);
            System.out.println("Клиент " + getName() + " подошел к банкомату");
            Thread.sleep(3000);
            System.out.println(bankAccount.getAmount());
            Thread.sleep(3000);
            if (bankAccount.getAmount() > sum) {
                bankAccount.withdrawMoney(sum);
                System.out.println("Клиент " + getName() + " успешно снял деньги");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    // Есть три потока
    // Первый поток выводит в консоль пять раз букву А (без переноса строки) -> AAAAA
    // Второй поток выводит в консоль пять раз букву Б (без переноса строки) -> БББББ
    // Третий поток выводит в консоль пять раз букву В (без переноса строки) -> ВВВВВ
    // Запустить все три потока одновременно, но добиться такого поведения,
    // чтобы результат в консоли был - АБВАБВАБВАБВАБВ
    // АБВААБВАБВ -> Х
    // Программа должна выполняться мгновенно, то есть всякие sleep и тому подобное
    // использовать нельзя.
}
