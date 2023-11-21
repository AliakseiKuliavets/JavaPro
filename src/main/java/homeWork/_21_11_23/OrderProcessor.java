package homeWork._21_11_23;

import java.util.PriorityQueue;


public class OrderProcessor {
    private final PriorityQueue<Order> orderQueue = new PriorityQueue<>();

    public synchronized void addOrderInQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        orderQueue.add(order);
        System.out.println("Заказ добавлен в очередь");
    }

    public synchronized Order extractOrderFromQueue() {
        if (orderQueue.isEmpty()) {
            return null;
        }
        return orderQueue.poll();
    }
}
