package homeWork._21_11_23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            System.out.println("Продукт не был оплачен");
        }
    }

    public synchronized void changeStatusOrder(StatusOrder newStatusOrder) {
        if (statusOrder == newStatusOrder || statusOrder == null) {
            throw new IllegalArgumentException("Нельзя изменить на тот же статус или передавать NULL");
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

}
