package homeWork._21_11_23;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class OrderGeneratorThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            createNewOrder(createProduct());
        }
    }

    public void createNewOrder(List<Product> productList) {
        if (productList == null) {
            throw new IllegalArgumentException("Продукт не может быть добавлен в заказ если он равен NULL");
        }
        Order order = new Order();
        order.addProductInOrder(productList);
        System.out.println("Заказ успешно создан");
    }

    private List<Product> createProduct() {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Faker faker = new Faker();
            productList.add(new Product(faker.stock().nsdqSymbol(),
                    faker.number().randomDouble(2, 0, 25)));
        }
        return productList;
    }
}
