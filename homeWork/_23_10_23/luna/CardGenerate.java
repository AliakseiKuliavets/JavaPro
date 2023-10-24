package homeWork._23_10_23.luna;

import java.util.Random;

public class CardGenerate {
    Random random = new Random();

    public String returnNumberCard() {
        return generateNumberCard();
    }

    private String generateNumberCard() {
        return generateNumber() + generateDataCard() + generateCVVCard();
    }

    private String generateNumber() {
        return String.valueOf(random.nextLong(1_000_000_000_000_000L, 9_999_999_999_999_999L));
    }

    private String generateDataCard() {
        String months;
        int numberOfMounts = random.nextInt(1, 13);
        if (numberOfMounts >= 1 && numberOfMounts < 10) {
            months = "0" + numberOfMounts;
        } else {
            months = String.valueOf(numberOfMounts);
        }
        String year = String.valueOf(random.nextInt(4, 6) + 23);
        return months + year;
    }

    private String generateCVVCard() {
        return String.valueOf(random.nextInt(100, 1000));
    }
}
