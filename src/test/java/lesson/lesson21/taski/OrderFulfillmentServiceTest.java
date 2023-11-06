package lesson.lesson21.taski;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OrderFulfillmentServiceTest {

    @Test
    public void fulfillOrderWithSufficientStock() {
        Product product = new Product("123", 100);
        String sku = product.getSku();
        int quantity = 50;
        InventoryService inventoryService = Mockito.mock(InventoryService.class);

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(100);
        Mockito.when(inventoryService.updateStock(sku, -quantity)).thenReturn(true);

        OrderFulfillmentService orderFulfillmentService = new OrderFulfillmentService(inventoryService);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertTrue(result);
        Assertions.assertEquals(50, product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
        Mockito.verify(inventoryService).updateStock(sku, -quantity);
    }

    @Test
    public void fulfillOrderWithFalsetStock() {
        Product product = new Product("123", 150);
        String sku = product.getSku();
        int quantity = -200;
        InventoryService inventoryService = Mockito.mock(InventoryService.class);

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(150);

        OrderFulfillmentService orderFulfillmentService = new OrderFulfillmentService(inventoryService);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(150,product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
        Mockito.verify(inventoryService).updateStock(sku, -quantity);
    }
}