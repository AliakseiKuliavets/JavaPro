package homeWork._21_11_23;

import java.util.Map;

public class Order {
    private int id;
    private StatusOrder statusOrder;
    private Map<Integer, Product> productOrderMap;

    public Order() {
        ++id;
        statusOrder = StatusOrder.START;
    }

    public void addProductInOrder(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Нельзя передавать товары в заказ которые равны NULL");
        }
        productOrderMap.put(id, product);
        System.out.println("Продукт добавлен в заказ");
    }

    public void changeStatusOrder(StatusOrder newStatusOrder) {
        if (statusOrder == newStatusOrder) {
            throw new IllegalArgumentException("Нельзя изменить на тот же статус");
        }
        statusOrder = newStatusOrder;
    }

    public int getId() {
        return id;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public Map<Integer, Product> getProductOrderMap() {
        return productOrderMap;
    }
}
