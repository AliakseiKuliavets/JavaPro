package homeWork._21_11_23.thread;


import homeWork._21_11_23.enums.StatusOrder;
import homeWork._21_11_23.model.Order;
import homeWork._21_11_23.processor.LogisticsCenter;
import homeWork._21_11_23.processor.OrderProcessor;

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
            if (order != null && !order.getProductOrderMap().isEmpty()) {
                processOrder(order);
            } else {
                break;
            }
        }
    }

    private synchronized void processOrder(Order order) {
        logisticsCenter.addAcceptedOrderInReadyQueue(order);
    }
}
