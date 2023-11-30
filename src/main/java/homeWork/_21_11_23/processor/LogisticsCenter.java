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

    public void returnOrderFromList(List<OrderProcessor> orderProcessorList){
        for (OrderProcessor orderProcessor :orderProcessorList) {
            if (!orderProcessor.getOrderQueue().isEmpty()){
                for (Order order :orderProcessor.getOrderQueue()){
                    addAcceptedOrderInReadyQueue(order);
                }
            }
        }
    }

    public synchronized Order extractReadyToShipOrder() {
        for (Order order : orderQueueStatusReadyToShip) {
            if (order.getStatusOrder().equals(StatusOrder.READY_TO_SHIP)) {
                order.changeStatusOrder(StatusOrder.DELIVERED);
                orderQueueStatusReadyToShip.remove(order);
                System.out.println("Заказ в пути до клиента");
                return order;
            }
        }
        return null;
    }

    public synchronized Queue<Order> getOrderQueueStatusReadyToShip() {
        return orderQueueStatusReadyToShip;
    }
}
