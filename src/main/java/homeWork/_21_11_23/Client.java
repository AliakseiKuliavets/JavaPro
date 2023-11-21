package homeWork._21_11_23;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Client {
    private final Queue<Order> orderQueueClient = new LinkedList<>();

    public synchronized void createNewOrder(List<Product> productList) {
        if (productList == null) {
            throw new IllegalArgumentException("Список товаров не может быть NUll");
        }
        Order orderClient = new Order();
        orderClient.addProductInOrder(productList);
        orderQueueClient.add(orderClient);
        System.out.println("Создан новый заказ");
    }

    public synchronized void followStatusOrder(Order orderClient) {
        if (orderClient == null) {
            throw new IllegalArgumentException("Для просмотра статуса заказа нужно указать какой товар");
        }
        System.out.println("Статус заказа: " + orderClient.getStatusOrder());
    }
}
