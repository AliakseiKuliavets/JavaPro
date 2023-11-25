package homeWork._21_11_23;

import java.util.List;

public class OrderManagementSystem {
    private List<OrderProcessor> orderProcessorList;

    private volatile boolean isRunning;

    public OrderManagementSystem(List<OrderProcessor> orderProcessorList) {
        this.orderProcessorList = orderProcessorList;
    }

    public void runManagementSystem(Order order) {
        System.out.println("Запуск системы распределение заказов по обработчикам");
        isRunning = true;
        if (isRunning) {
            for (OrderProcessor processor : orderProcessorList) {
                processor.addOrderInQueue(order);
            }
        }
    }

    public void stopManagementSystem() {
        System.out.println("Остановка системы распределение заказов по обработчикам");
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
