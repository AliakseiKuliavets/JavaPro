package homeWork._21_11_23;

import java.util.Map;
import java.util.PriorityQueue;


public class OrderProcessor {
    private PriorityQueue<Order> orderQueue;

    public synchronized void addOrderInQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        orderQueue.add(order);
        System.out.println("Заказ добавлен в очередь");
    }

    public synchronized void extractOrderFromQueue(Order order) {
        if (orderQueue.isEmpty()) {
            throw new IllegalArgumentException("В очереди нет заказов");
        }
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        if (order.getStatusOrder() == StatusOrder.ACCEPTED) {
            orderQueue.remove(order);
            System.out.println("Заказ готов, для передачи в логистический центр");
        }
    }
}
