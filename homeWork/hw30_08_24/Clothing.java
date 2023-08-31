package homeWork.hw30_08_24;

import homeWork.hw30_08_24.enums.Currency;
import homeWork.hw30_08_24.enums.ProductCategory;
import homeWork.hw30_08_24.enums.Size;


public class Clothing extends Product{
    private final Size size;

    public Clothing(int id, ProductCategory productCategory, double price, Currency currency, Size size) {
        super(id, productCategory , price, currency);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", price=" + getPrice() +
                ", currency=" + getCurrency() +
                ", size=" + size +
                '}';
    }
}
