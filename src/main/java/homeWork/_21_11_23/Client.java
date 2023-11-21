package homeWork._21_11_23;

import java.util.PriorityQueue;

public class Client {
    private int idClient;
    private PriorityQueue<Order> orderQueueClient;

    public void createNewOrder(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Товар не может быть NUll");
        }
        Order orderClient = new Order();
        orderClient.addProductInOrder(product);
        orderQueueClient.add(orderClient);
        System.out.println("Создан новый заказ");
    }

    public void followStatusOrder(Order orderClient) {
        if (orderClient == null) {
            throw new IllegalArgumentException("Для просмотра статуса заказа нужно указать какой товар");
        }
        System.out.println("Статус заказа: " + orderClient.getStatusOrder());
    }
}
