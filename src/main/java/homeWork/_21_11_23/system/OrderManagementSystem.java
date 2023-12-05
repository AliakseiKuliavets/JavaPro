package homeWork._21_11_23.system;

import homeWork._21_11_23.enums.StatusOrder;
import homeWork._21_11_23.model.Order;
import homeWork._21_11_23.processor.OrderProcessor;

import java.util.ArrayList;
import java.util.List;

/*
Система Управления Заказами (OrderManagementSystem)
Поля: список обработчиков заказов, volatile флаг работы системы.
Методы: запуск и остановка системы, распределение заказов по обработчикам.
 */
public class OrderManagementSystem {
    private final List<OrderProcessor> orderProcessorList;

    private List<Order> orderList;

    private volatile boolean isRunning;

    public OrderManagementSystem(List<OrderProcessor> orderProcessorList, List<Order> orderList) {
        this.orderProcessorList = orderProcessorList;
        this.orderList = orderList;
    }

    public synchronized void managementSystem() {
        System.out.println("Запуск менеджера систем");
        if (isRunning) {
            if (!orderList.isEmpty()) {
                distributeOrders();
            }
            stopManagementSystem();
        }
    }

    private synchronized void distributeOrders() {
        int processorIndex = 0;
        for (Order order : orderList) {
            OrderProcessor orderProcessor = orderProcessorList.get(processorIndex);
            order.changeStatusOrder(StatusOrder.ACCEPTED_IN_STOCK);
            orderProcessor.addOrderInQueue(order);
            processorIndex++;
            if (processorIndex >= orderProcessorList.size()) {
                processorIndex = 0;
            }
        }
        orderList = new ArrayList<>();
    }

    public void stopManagementSystem() {
        System.out.println("Остановка системы распределение заказов по обработчикам");
        isRunning = false;
    }

    public void runManagementSystem() {
        System.out.println("Запуск системы распределение заказов по обработчикам");
        isRunning = true;
    }

    public synchronized void receptionOrderSheet(List<Order> orderList){
        if (orderList.isEmpty()){
            System.out.println("Лист заказов пуст");
        }
        this.orderList.addAll(orderList);
    }

    public boolean isRunning() {
        return isRunning;
    }
}
