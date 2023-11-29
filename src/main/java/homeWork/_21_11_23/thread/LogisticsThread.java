package homeWork._21_11_23.thread;


import homeWork._21_11_23.model.Order;
import homeWork._21_11_23.processor.LogisticsCenter;

public class LogisticsThread extends Thread {
    private LogisticsCenter logisticsCenter;

    public LogisticsThread(LogisticsCenter logisticsCenter) {
        this.logisticsCenter = logisticsCenter;
    }

    @Override
    public void run() {
        while (true) {
            Order order = logisticsCenter.extractReadyToShipOrder();
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
