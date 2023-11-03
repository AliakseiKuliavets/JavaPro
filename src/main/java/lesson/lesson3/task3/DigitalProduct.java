package lesson.lesson3.task3;

import lesson.lesson3.task3.interfac.Discountable;

public class DigitalProduct extends Product implements Discountable {

    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountedPrice = getPrice() - (getPrice() * (percentage / 100.0));
        setPrice(discountedPrice);
    }
}
