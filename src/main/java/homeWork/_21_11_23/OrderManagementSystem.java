package homeWork._21_11_23;

import java.util.Iterator;
import java.util.List;

/*
Система Управления Заказами (OrderManagementSystem)
Поля: список обработчиков заказов, volatile флаг работы системы.
Методы: запуск и остановка системы, распределение заказов по обработчикам.
 */
public class OrderManagementSystem {
    private final List<OrderProcessor> orderProcessorList;

    private final List<Order> orderList;

    private volatile boolean isRunning;

    public OrderManagementSystem(List<OrderProcessor> orderProcessorList, List<Order> orderList) {
        this.orderProcessorList = orderProcessorList;
        this.orderList = orderList;
    }

    public void managementSystem() {
        System.out.println("Запуск менеджера систем");
        if (isRunning) {
            if (orderProcessorList.size() == 4 && !orderList.isEmpty()) {
                distributeOrders();
            }
            stopManagementSystem();
        }
    }

    private void distributeOrders() {
        Iterator<Order> iterator = orderList.iterator();
        int processorIndex = 0;
        while (iterator.hasNext()) {
            if (processorIndex >= orderProcessorList.size()) {
                processorIndex = 0;
            }
            Order order = iterator.next();
            OrderProcessor orderProcessor = orderProcessorList.get(processorIndex);
            orderProcessor.addOrderInQueue(order);
            System.out.println("Заказ " + order + " был добавлен в " + orderProcessor);
            iterator.remove();
            processorIndex++;
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
