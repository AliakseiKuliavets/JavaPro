package homeWork._21_11_23;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        OrderProcessor orderProcessor1 = new OrderProcessor();
        OrderProcessor orderProcessor2 = new OrderProcessor();
        OrderProcessor orderProcessor3 = new OrderProcessor();
        OrderProcessor orderProcessor4 = new OrderProcessor();
        List<OrderProcessor> orderProcessorList = Arrays.asList(orderProcessor1, orderProcessor2,
                orderProcessor3,orderProcessor4);

        OrderManagementSystem orderManagementSystem = getOrderManagementSystem(orderProcessorList);
        LogisticsCenter logisticsCenter = new LogisticsCenter();


        orderManagementSystem.runManagementSystem();
        orderManagementSystem.managementSystem();

        for (OrderProcessor orderProcessor : orderProcessorList) {
            OrderProcessingThread orderProcessingThread = new OrderProcessingThread(orderProcessor, logisticsCenter);
            orderProcessingThread.start();
            try {
                orderProcessingThread.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            LogisticsThread logisticsThread = new LogisticsThread(logisticsCenter);
            logisticsThread.start();

            try {
                logisticsThread.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            MonitoringThread monitoringThread = new MonitoringThread(orderManagementSystem);
            monitoringThread.start();

            try {
                monitoringThread.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            OrderGeneratorThread orderGeneratorThread = new OrderGeneratorThread();
            orderGeneratorThread.start();
            try {
                orderGeneratorThread.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        // Создаем клиента и товары для заказа
        Client client = new Client();
        Product product1 = new Product("Product 1", 10.5);
        Product product2 = new Product("Product 2", 15.0);

        // Создаем заказ и добавляем товары
        Order order = new Order();
        order.addProductInOrder(List.of(product1, product2));

        // Передаем заказ клиенту и отслеживаем его статус
        client.createNewOrder(order.getProductOrderMap().get(order.getId()));
        client.followStatusOrder(order);
    }

    private static OrderManagementSystem getOrderManagementSystem(List<OrderProcessor> orderProcessorList) {
        Order order1 = new Order();
        List<Product> productList1 = Arrays.asList(new Product("Tomate", 20.2),
                new Product("Melon", 1.0));
        order1.addProductInOrder(productList1);

        Order order2 = new Order();
        List<Product> productList2 = Arrays.asList(new Product("Малина", 20.2),
                new Product("Сыр", 1.0));
        order2.addProductInOrder(productList2);

        List<Order> orderList = new ArrayList<>(Arrays.asList(order1, order2));

        return new OrderManagementSystem(orderProcessorList, orderList);
    }
}
