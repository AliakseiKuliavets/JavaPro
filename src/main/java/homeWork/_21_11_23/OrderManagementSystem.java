package homeWork._21_11_23;

import java.util.Iterator;
import java.util.List;

public class OrderManagementSystem {
    private List<OrderProcessor> orderProcessorList;

    private List<Order> orderList;

    private volatile boolean isRunning;

    public OrderManagementSystem(List<OrderProcessor> orderProcessorList, List<Order> orderList) {
        this.orderProcessorList = orderProcessorList;
        this.orderList = orderList;
    }

    public void managementSystem() {
        System.out.println("Запуск менеджера систем");
        if (isRunning) {
            Iterator<Order> iterator = orderList.iterator();
            while (iterator.hasNext()) {
                Order order = iterator.next();
                for (OrderProcessor orderProcessor : orderProcessorList) {
                    orderProcessor.addOrderInQueue(order);
                    iterator.remove();
                    break;
                }
            }
        }
    }

    public void stopManagementSystem() {
        System.out.println("Остановка системы распределение заказов по обработчикам");
        isRunning = false;
    }

    public void runManagementSystem() {
        System.out.println("Остановка системы распределение заказов по обработчикам");
        isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
