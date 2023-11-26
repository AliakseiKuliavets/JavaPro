package homeWork._21_11_23;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
Логистический Центр (LogisticsCenter)
Поля: список готовых к отправке заказов (Queue).
Методы: добавление готового заказа (синхронизированный), отправка заказов.
 */
public class LogisticsCenter {
    private final List<Order> orderQueueStatusReadyToShip = new ArrayList<>();

    public synchronized void addAcceptedOrderInReadyQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        if (order.getStatusOrder() == StatusOrder.ACCEPTED_IN_STOCK) {
            order.changeStatusOrder(StatusOrder.READY_TO_SHIP);
            orderQueueStatusReadyToShip.add(order);
            System.out.println("Заказ в пути до клиента");
        } else {
            throw new RuntimeException("Товар не готов к отправке");
        }
    }

    public synchronized Order extractReadyToShipOrder(List<Order> orderQueueStatusReadyToShip) {
        for (Order order: orderQueueStatusReadyToShip){
            if (order.getStatusOrder() == StatusOrder.READY_TO_SHIP){
                orderQueueStatusReadyToShip.remove(order);
                return order;
            }
        }
        return null;
    }

    public List<Order> getOrderQueueStatusReadyToShip() {
        return orderQueueStatusReadyToShip;
    }
}
