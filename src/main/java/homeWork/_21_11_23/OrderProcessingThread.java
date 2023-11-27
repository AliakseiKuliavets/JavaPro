package homeWork._21_11_23;


public class OrderProcessingThread extends Thread {
    private final OrderProcessor orderProcessor;
    private final LogisticsCenter logisticsCenter;

    public OrderProcessingThread(OrderProcessor orderProcessor, LogisticsCenter logisticsCenter) {
        this.orderProcessor = orderProcessor;
        this.logisticsCenter = logisticsCenter;
    }

    @Override
    public void run() {
        while (true) {
            Order order = orderProcessor.extractOrderFromQueue();
            if (order != null) {
                processOrder(order);
            } else {
                break;
            }
        }
    }

    private synchronized void processOrder(Order order) {
        order.changeStatusOrder(StatusOrder.ACCEPTED_IN_STOCK);
        logisticsCenter.addAcceptedOrderInReadyQueue(order);
    }
}
