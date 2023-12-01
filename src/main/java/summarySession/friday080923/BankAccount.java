package summarySession.friday080923;

import java.math.BigDecimal;

public class BankAccount {
    private static double money;
    private static BigDecimal wiseMoney1;
    public static void main(String[] args) {
        money = 0;
        wiseMoney1 =BigDecimal.ZERO;
        for (int i = 0; i < 10_000; i++) {
            wiseMoney(0.1);
            wiseMoney1 = wiseMoney1.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(money);
        System.out.println(wiseMoney1);
    }
    public synchronized static void wiseMoney(double sum){
        money = money + sum;
    }
}
