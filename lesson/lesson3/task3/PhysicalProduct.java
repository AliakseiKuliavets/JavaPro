package lesson.lesson3.task3;

import lesson.lesson3.task3.interfac.Discountable;

public class PhysicalProduct extends Product implements Discountable {
    private final double margin;

    public PhysicalProduct(String name, double price, double margin) {
        super(name, price);
        this.margin = margin;
    }

    @Override
    public double applyDiscount(double percentage) {
        double discountedPrice = getPrice() - (getPrice() * (percentage / 100.0));
        setPrice(discountedPrice + margin);
        return getPrice();
    }
}
