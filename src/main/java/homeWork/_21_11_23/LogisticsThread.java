package homeWork._21_11_23;

public class LogisticsThread extends Thread{
    private final LogisticsCenter logisticsCenter;

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

    private void shipOrder(Order order) {
        System.out.println("Заказ отправлен клиенту: " + order.getId());
    }
}
