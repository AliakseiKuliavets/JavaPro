package homeWork._21_11_23;

import java.util.List;

public class OrderManagementSystem {
    private volatile List<OrderProcessor> orderProcessorList;

    public OrderManagementSystem(List<OrderProcessor> orderProcessorList) {
        this.orderProcessorList = orderProcessorList;
    }

    public void runManagementSystem(Order order) {
        System.out.println("Запуск системы распределение заказов по обработчикам");
        for (OrderProcessor processor : orderProcessorList) {
            if (!(stopManagementSystem())) {
                processor.addOrderInQueue(order);
            }
        }
    }

    public boolean stopManagementSystem() {
        System.out.println("Остановка системы распределение заказов по обработчикам");
        return true;
    }
}
