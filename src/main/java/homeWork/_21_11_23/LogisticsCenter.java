package homeWork._21_11_23;

import java.util.PriorityQueue;

public class LogisticsCenter {
    private PriorityQueue<Order> orderQueueStatusReadyToShip;

    public synchronized void addAcceptedOrderInReadyQueue(Order order) {
        if (order == null || order.getProductOrderMap().isEmpty()) {
            throw new IllegalArgumentException("Заказ не должен быть пуст или равен NULL");
        }
        if (order.getStatusOrder() == StatusOrder.ACCEPTED) {
            order.changeStatusOrder(StatusOrder.READY_TO_SHIP);
            orderQueueStatusReadyToShip.add(order);
            System.out.println("Заказ в пути до клиента");
        }
    }
}
