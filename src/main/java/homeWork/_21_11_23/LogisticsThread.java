package homeWork._21_11_23;

import java.util.List;

public class LogisticsThread extends Thread {
    private LogisticsCenter logisticsCenter;

    public LogisticsThread(LogisticsCenter logisticsCenter) {
        this.logisticsCenter = logisticsCenter;
    }

    @Override
    public void run() {
        List<Order> orderList = logisticsCenter.getOrderQueueStatusReadyToShip();
        while (true) {
            Order order = logisticsCenter.extractReadyToShipOrder(orderList);
            if (order != null) {
                shipOrder(order);
            } else {
                break;
            }
        }
    }

    private synchronized void shipOrder(Order order) {
        System.out.println("Заказ отправлен клиенту: " + order.getId());
    }
}
