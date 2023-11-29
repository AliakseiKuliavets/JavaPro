package homeWork._21_11_23.thread;

import com.github.javafaker.Faker;
import homeWork._21_11_23.model.Client;
import homeWork._21_11_23.model.Order;
import homeWork._21_11_23.model.Product;
import homeWork._21_11_23.processor.OrderProcessor;
import homeWork._21_11_23.system.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
/*
Потоки и их задачи:
Поток-генератор заказов (OrderGeneratorThread)
Создает новые заказы и добавляет их в систему управления заказами.
 */

public class OrderGeneratorThread extends Thread {

    private List<OrderProcessor> processorList;
    private List<Order> listOrder = new ArrayList<>();

    public OrderGeneratorThread(List<OrderProcessor> processorList) {
        this.processorList = processorList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                sleep(1000);
                listOrder.add(createNewOrder(createProduct()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        OrderManagementSystem orderManagementSystem = new OrderManagementSystem(processorList, listOrder);
        orderManagementSystem.runManagementSystem();
        orderManagementSystem.managementSystem();
    }

    public synchronized Order createNewOrder(List<Product> productList) {
        if (productList == null) {
            throw new IllegalArgumentException("Продукт не может быть добавлен в заказ если он равен NULL");
        }
        Order order = new Order();
        order.addProductInOrder(productList);
        System.out.println("Заказ успешно создан");
        return order;
    }

    private synchronized List<Product> createProduct() {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Faker faker = new Faker();
            productList.add(new Product(faker.stock().nsdqSymbol(),
                    faker.number().randomDouble(2, 0, 25)));
        }
        return productList;
    }
}
