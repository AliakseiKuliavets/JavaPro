package homeWork._21_11_23.processor;

import homeWork._21_11_23.model.Order;

import java.util.LinkedList;
import java.util.Queue;

/*
Обработчик Заказов (OrderProcessor)
Поля: очередь заказов (Queue).
Методы: добавление заказа в очередь (синхронизированный), извлечение заказа из очереди (синхронизированный).
 */
public class OrderProcessor {
    private Queue<Order> orderQueue = new LinkedList<>();

    public synchronized void addOrderInQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        orderQueue.add(order);
        System.out.println("Заказ добавлен в очередь");
    }

    public synchronized Order extractOrderFromQueue() {
        System.out.println("Заказ был извлечен из очереди" + orderQueue);
        return orderQueue.poll();
    }

    @Override
    public String toString() {
        return "OrderProcessor{" +
                "orderQueue=" + orderQueue +
                '}';
    }
}
