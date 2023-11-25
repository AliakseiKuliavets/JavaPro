package homeWork._21_11_23;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order();
        List<Product> productList1 = Arrays.asList(new Product("Tomate", 20.2),
                new Product("Melon", 1.0));
        order1.addProductInOrder(productList1);
        List<Order> orderList = new ArrayList<>(Arrays.asList(order1));


        OrderProcessor orderProcessor = new OrderProcessor();
        OrderManagementSystem orderManagementSystem = new OrderManagementSystem(List.of(orderProcessor), orderList);
        LogisticsCenter logisticsCenter = new LogisticsCenter();
        orderManagementSystem.runManagementSystem();
        orderManagementSystem.managementSystem();

        // Создаем и запускаем потоки
        OrderProcessingThread orderProcessingThread = new OrderProcessingThread(orderProcessor, logisticsCenter);
        orderProcessingThread.start();

        LogisticsThread logisticsThread = new LogisticsThread(logisticsCenter);
        logisticsThread.start();

        MonitoringThread monitoringThread = new MonitoringThread(orderManagementSystem);
        monitoringThread.start();

        OrderGeneratorThread orderGeneratorThread = new OrderGeneratorThread();
        orderGeneratorThread.start();

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
}
