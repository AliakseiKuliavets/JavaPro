package lesson.lesson2.example1.enums;

public enum Currency {
    USD("$"),
    EUR("€");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }
}
