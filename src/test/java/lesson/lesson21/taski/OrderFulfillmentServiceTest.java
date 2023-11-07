package lesson.lesson21.taski;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderFulfillmentServiceTest {

    @InjectMocks
    private OrderFulfillmentService orderFulfillmentService;

    @Mock
    private InventoryService inventoryService;


    @Test
    public void fulfillOrderWithSufficientStock() {
        Product product = new Product("123", 100);
        String sku = product.getSku();
        int quantity = 50;

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(100);
        Mockito.when(inventoryService.updateStock(sku, -quantity)).thenReturn(true);

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

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(150);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(150, product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
        Mockito.verify(inventoryService).updateStock(sku, -quantity);
    }

    @Test
    public  void returnItemsToInventoryTrueTest(){
        Product product = new Product("123", 150);
        String sku = product.getSku();
        int quantity = 50;

        Mockito.when(inventoryService.updateStock(sku, quantity)).thenReturn(true);

        boolean result = orderFulfillmentService.returnItemsToInventory(product, quantity);

        Assertions.assertTrue(result);
        Assertions.assertEquals(200, product.getStockQuantity());

        Mockito.verify(inventoryService).updateStock(sku, quantity);
    }

    @Test
    public void returnItemsToInventoryFalseTest(){
        Product product = new Product("123", 150);
        String sku = product.getSku();
        int quantity = -150;

        Mockito.when(inventoryService.updateStock(sku, quantity)).thenReturn(false);

        boolean result = orderFulfillmentService.returnItemsToInventory(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(150, product.getStockQuantity());

        Mockito.verify(inventoryService).updateStock(sku, quantity);
    }
}