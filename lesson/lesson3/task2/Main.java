package lesson.lesson3.task2;

public class Main {
    public static void main(String[] args) {
        FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
        CreditAccount creditAccount = new CreditAccount("789012", -500, 1000);

        fixedAccount.transfer(creditAccount, 300);
        creditAccount.transfer(fixedAccount,300);


        System.out.println("Fixed account balance: " + fixedAccount.getBalance());
        System.out.println("Credit account balance: " + creditAccount.getBalance());
    }
}
