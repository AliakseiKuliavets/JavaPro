package homeWork._23_10_23.luna;

import java.util.Random;

public class CardGenerate {
    private static final int years = 2023;
    Random random = new Random();

    public String returnNumberCard() {
        return generateNumberCard();
    }

    private String generateNumberCard() {
        return generateNumber() + generateDataMonthsCard() + generateDataYearCard() + generateCVVCard();
    }

    private String generateNumber() {
        return String.valueOf(random.nextLong(1_000_000_000_000_000L, 10_000_000_000_000_000L));
    }

    private String generateDataMonthsCard() {
        String months;
        int numberOfMounts = random.nextInt(1, 13);
        if (numberOfMounts >= 1 && numberOfMounts < 10) {
            months = "0" + numberOfMounts;
        } else {
            months = String.valueOf(numberOfMounts);
        }
        return months;
    }
    private String generateDataYearCard(){
        return String.valueOf(random.nextInt(4, 6) + ( CardGenerate.years- 2000));
    }

    private String generateCVVCard() {
        return String.valueOf(random.nextInt(100, 1000));
    }
}
