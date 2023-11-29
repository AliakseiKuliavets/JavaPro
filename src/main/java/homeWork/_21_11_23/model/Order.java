package homeWork._21_11_23.model;

import homeWork._21_11_23.enums.StatusOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Заказ (Order)
Поля: идентификатор заказа, статус, список товаров.
Методы: добавление товара, изменение статуса заказа.
 */
public class Order {
    private static int idCounter = 0;
    private final int id;
    private StatusOrder statusOrder;
    private final Map<Integer, List<Product>> productOrderMap = new HashMap<>();

    public Order() {
        id = ++idCounter;
        statusOrder = StatusOrder.START;
    }

    public synchronized void addProductInOrder(List<Product> productList) {
        if (productList == null) {
            throw new IllegalArgumentException("Нельзя передавать товары в заказ которые равны NULL");
        }
        if (isPaid()) {
            statusOrder = StatusOrder.ACCEPTED;
            productOrderMap.put(id, productList);
            System.out.println("Продукт добавлен в заказ");
        } else {
            throw new RuntimeException("Продукт не был оплачен");
        }
    }

    public synchronized void changeStatusOrder(StatusOrder newStatusOrder) {
        if (statusOrder == null) {
            throw new IllegalArgumentException("Нельзя передавать statusOrder == NULL");
        }
        if (statusOrder == newStatusOrder) {
            throw new IllegalArgumentException("Нельзя изменить на тот же статус");
        }
        statusOrder = newStatusOrder;
    }

    public boolean isPaid() {
        return true;
    }

    public int getId() {
        return id;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public Map<Integer, List<Product>> getProductOrderMap() {
        return productOrderMap;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", statusOrder=" + statusOrder +
                ", productOrderMap=" + productOrderMap +
                '}';
    }
}
