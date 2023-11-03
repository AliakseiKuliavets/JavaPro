package homeWork._202308_30;

import homeWork._202308_30.enums.Currency;
import homeWork._202308_30.enums.ProductCategory;
import homeWork._202308_30.enums.Size;

import java.util.ArrayList;

public class ShopManager {
    public static void main(String[] args) {
        Product product1 = new Product(1, ProductCategory.JEANS, 29.99, Currency.EUR);
        Product product2 = new Product(2, ProductCategory.JEANS, 39.99, Currency.USD);
        Product product3 = new Clothing(3, ProductCategory.SHIRT, 19.99, Currency.EUR, Size.M);
        Product product4 = new Clothing(4, ProductCategory.SHIRT, 24.99, Currency.USD, Size.L);
        Product product5 = new Product(5, ProductCategory.SNEAKERS, 99.99, Currency.EUR);
        Product product6 = new Product(6, ProductCategory.SNEAKERS, 129.99, Currency.USD);

        ArrayList<Product> products = new ArrayList<>();
        addProduct(products, product1);
        addProduct(products, product2);
        addProduct(products, product3);
        addProduct(products, product4);
        addProduct(products, product5);
        addProduct(products, product6);

        System.out.println(products);
        System.out.println();

        getProductsByCategory(products, ProductCategory.JEANS);
        System.out.println();

        double minPrice = 20.0;
        double maxPrice = 100.0;
        Currency currency = Currency.USD;
        getProductsByPriceRange(minPrice,maxPrice,currency,products);

    }

    private static void addProduct(ArrayList<Product> products, Product product) {
        products.add(product);
    }

    private static void getProductsByCategory(ArrayList<Product> products, ProductCategory category) {
        for (Product product : products) {
            if (product.getName() == category) {
                System.out.println(product);
            }
        }
    }
    private static void getProductsByPriceRange(double minPrice, double maxPrice, Currency currency, ArrayList<Product> products){
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice && product.getCurrency().equals(currency) ) {
                System.out.println(product);
            }
        }
    }
}
