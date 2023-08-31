package homeWork._202308_30;

import homeWork._202308_30.enums.Currency;
import homeWork._202308_30.enums.ProductCategory;
import lombok.Getter;

@Getter
public class Product {
    private final int id;
    private final ProductCategory name;
    private final double price;
    private final Currency currency;

    public Product(int id, ProductCategory productCategory, double price, Currency currency) {
        this.id = id;
        this.name = productCategory;
        this.price = price;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}
