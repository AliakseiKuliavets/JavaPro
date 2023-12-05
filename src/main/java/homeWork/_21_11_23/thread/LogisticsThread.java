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
        while (!(logisticsCenter.getOrderQueueStatusReadyToShip().isEmpty())) {
            logisticsCenter.extractReadyToShipOrder();
        }
    }

    private synchronized void shipOrder(Order order) {
        System.out.println("Заказ отправлен клиенту: " + order.getId());
    }
}
