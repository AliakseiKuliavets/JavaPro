package homeWork._21_11_23.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Клиент (Client)
Поля: идентификатор клиента, список заказов.
Методы: создание нового заказа, отслеживание статуса заказа.
 */
public class Client {
    private static int counter = 0;
    private final int id;
    private final List<Order> orderListClient = new LinkedList<>();

    public Client() {
        this.id = ++counter;
    }

    public synchronized Order createNewOrder(List<Product> productList) {
        if (productList == null) {
            throw new IllegalArgumentException("Список товаров не может быть NUll");
        }
        Order orderClient = new Order();
        orderClient.addProductInOrder(productList);
        orderListClient.add(orderClient);
        System.out.println("Создан новый заказ");
        return orderClient;
    }

    public synchronized void followStatusOrder(Order orderClient) {
        if (orderClient == null) {
            throw new IllegalArgumentException("Для просмотра статуса заказа нужно указать какой товар");
        }
        if (orderListClient.contains(orderClient)) {
            for (Order o : orderListClient) {
                if (orderClient.equals(o)) {
                    System.out.println("Статус заказа: " + orderClient.getStatusOrder());
                }
            }
        } else {
            System.out.println("У вас нет доступа к этому заказа");
        }
    }
}
