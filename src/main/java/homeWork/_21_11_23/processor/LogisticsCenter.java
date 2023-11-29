package homeWork._21_11_23.processor;

import homeWork._21_11_23.enums.StatusOrder;
import homeWork._21_11_23.model.Order;

import java.util.*;

/*
Логистический Центр (LogisticsCenter)
Поля: список готовых к отправке заказов (Queue).
Методы: добавление готового заказа (синхронизированный), отправка заказов.
 */
public class LogisticsCenter {
    private final Queue<Order> orderQueueStatusReadyToShip = new LinkedList<>();

    public synchronized void addAcceptedOrderInReadyQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        if (order.getStatusOrder() == StatusOrder.ACCEPTED_IN_STOCK) {
            orderQueueStatusReadyToShip.add(order);
            System.out.println("Заказ в пути до клиента");
        } else {
            throw new RuntimeException("Товар не готов к отправке");
        }
    }

    public synchronized Order extractReadyToShipOrder() {
        for (Order order : orderQueueStatusReadyToShip) {
            if (order.getStatusOrder() == StatusOrder.READY_TO_SHIP) {
                orderQueueStatusReadyToShip.remove(order);
                return order;
            }
        }
        return null;
    }

    public synchronized Queue<Order> getOrderQueueStatusReadyToShip() {
        return orderQueueStatusReadyToShip;
    }
}
