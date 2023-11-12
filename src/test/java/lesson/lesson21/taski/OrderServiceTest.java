package lesson.lesson21.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    private OrderService orderService;

    @Mock
    private PaymentService paymentService;

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("ad", 20.2, false);
        orderService = new OrderService(paymentService);
    }

    /**
     * Тест метода placeOrder(Order order) который проверяет, изменяется ли статус платежа на True если платеж поступил
     */
    @Test
    public void placeOrderTrue() {
        Mockito.when(paymentService.processPayment(order)).thenReturn(true);
        boolean result = orderService.placeOrder(order);

        assertTrue(result);
        assertTrue(order.isPaid());

        Mockito.verify(paymentService).processPayment(order);
    }

    /**
     * Тест метода placeOrder(Order order) который проверяет, изменяется ли статус платежа, если не платеж поступил
     */
    @Test
    public void placeOrderFalse() {
        Mockito.when(paymentService.processPayment(order)).thenReturn(false);
        boolean result = orderService.placeOrder(order);

        Assertions.assertFalse(result);
        Assertions.assertFalse(order.isPaid());

        Mockito.verify(paymentService).processPayment(order);
    }
}