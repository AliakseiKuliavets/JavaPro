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
        if (order.getStatusOrder().equals(StatusOrder.ACCEPTED_IN_STOCK)) {
            order.changeStatusOrder(StatusOrder.READY_TO_SHIP);
            orderQueueStatusReadyToShip.add(order);
        } else {
            throw new RuntimeException("Товар не готов к отправке");
        }
    }

    public synchronized void returnOrderFromList(List<OrderProcessor> orderProcessorList) {
        if (orderProcessorList == null || orderProcessorList.isEmpty()) {
            throw new RuntimeException("Лист обработчиков заказа пуст");
        }
        for (OrderProcessor orderProcessor : orderProcessorList) {
            if (!orderProcessor.getOrderQueue().isEmpty()) {
                for (int i = 0; i <= orderProcessor.getOrderQueue().size(); i++) {
                    addAcceptedOrderInReadyQueue(orderProcessor.extractOrderFromQueue());
                }
            }
        }
    }

    public synchronized Order extractReadyToShipOrder() {
        if (!orderQueueStatusReadyToShip.isEmpty()) {
            for (Order order : orderQueueStatusReadyToShip) {
                if (order.getStatusOrder().equals(StatusOrder.READY_TO_SHIP)) {
                    order.changeStatusOrder(StatusOrder.DELIVERED);
                    orderQueueStatusReadyToShip.remove(order);
                    System.out.println("Заказ в пути до клиента");
                    return order;
                }
            }
        } else {
            System.out.println("Заказов нет");
        }
        return null;
    }

    public Queue<Order> getOrderQueueStatusReadyToShip() {
        return orderQueueStatusReadyToShip;
    }
}
