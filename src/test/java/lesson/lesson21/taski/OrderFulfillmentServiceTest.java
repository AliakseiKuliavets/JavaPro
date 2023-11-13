package lesson.lesson21.taski;

import org.junit.jupiter.api.BeforeEach;
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

    private Product product;
    private int quantity;
    private String sku;

    @BeforeEach
    public void setUp() {
        product = new Product("123", 100);
    }

    /**
     * Тест который проверяет метод fulfillOrder(Product product, int quantity) если все условия пройдут
     * (stock >= quantity) == true
     * (stockUpdated) == true
     */

    @Test
    public void fulfillOrderWithSufficientTrueStock() {
        sku = product.getSku();
        quantity = 50;

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(100);
        Mockito.when(inventoryService.updateStock(sku, -quantity)).thenReturn(true);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertTrue(result);
        Assertions.assertEquals(50, product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
        Mockito.verify(inventoryService).updateStock(sku, -quantity);
    }

    /**
     * Тест который проверяет метод fulfillOrder(Product product, int quantity) если не все условия пройдут
     * (stock >= quantity) == false
     */
    @Test
    public void fulfillOrderWithSufficientFalseStock() {
        sku = product.getSku();
        quantity = 50;

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(100);
        Mockito.when(inventoryService.updateStock(sku, -quantity)).thenReturn(false);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(100, product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
        Mockito.verify(inventoryService).updateStock(sku, -quantity);
    }

    /**
     * Тест который проверяет метод fulfillOrder(Product product, int quantity) если не все условия пройдут
     * (stock >= quantity) == true
     * (stockUpdated) == false
     */

    @Test
    public void fulfillOrderWithFalseStock() {
        sku = product.getSku();
        quantity = 200;

        Mockito.when(inventoryService.checkProductStock(sku)).thenReturn(100);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(100, product.getStockQuantity());

        Mockito.verify(inventoryService).checkProductStock(sku);
    }

    /**
     * Тест который проверяет метод returnItemsToInventory(Product product, int quantity) если условия пройдут
     * (stockUpdated) == true
     */
    @Test
    public void returnItemsToInventoryTrueTest() {
        sku = product.getSku();
        quantity = 50;

        Mockito.when(inventoryService.updateStock(sku, quantity)).thenReturn(true);

        boolean result = orderFulfillmentService.returnItemsToInventory(product, quantity);

        Assertions.assertTrue(result);
        Assertions.assertEquals(150, product.getStockQuantity());

        Mockito.verify(inventoryService).updateStock(sku, quantity);
    }

    /**
     * Тест который проверяет метод returnItemsToInventory(Product product, int quantity) если условия пройдут
     * (stockUpdated) == false
     */
    @Test
    public void returnItemsToInventoryFalseTest() {
        String sku = product.getSku();
        quantity = 100;

        Mockito.when(inventoryService.updateStock(sku, quantity)).thenReturn(false);

        boolean result = orderFulfillmentService.returnItemsToInventory(product, quantity);

        Assertions.assertFalse(result);
        Assertions.assertEquals(100, product.getStockQuantity());

        Mockito.verify(inventoryService).updateStock(sku, quantity);
    }
}