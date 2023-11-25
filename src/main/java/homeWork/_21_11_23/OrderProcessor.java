package homeWork._21_11_23;

import java.util.LinkedList;
import java.util.Queue;


public class OrderProcessor {
    private Queue<Order> orderQueue;

    public synchronized void addOrderInQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        orderQueue.add(order);
        System.out.println("Заказ добавлен в очередь");
    }

    public synchronized Order extractOrderFromQueue() {
        if (orderQueue.isEmpty()) {
            throw new IllegalArgumentException("Очередь пуста");
        }
        return orderQueue.poll();
    }
}
