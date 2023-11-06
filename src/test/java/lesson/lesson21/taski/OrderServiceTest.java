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
    @Mock
    private OrderService orderService;

    @Mock
    private PaymentService paymentService;

    @BeforeEach
    public void setUp(){
        orderService = new OrderService(paymentService);
    }

    @Test
    public void placeOrderTrue() {
        Order order = new Order("ad", 20.2, false);
        Mockito.when(paymentService.processPayment(order)).thenReturn(true);

        boolean result = orderService.placeOrder(order);

        assertTrue(result);
        assertTrue(order.isPaid());

        Mockito.verify(paymentService).processPayment(order);
    }
    @Test
    public void placeOrderFalse() {
        Order order = new Order("ad", 20.2, false);
        Mockito.when(paymentService.processPayment(order)).thenReturn(false);

        boolean result = orderService.placeOrder(order);

        Assertions.assertFalse(result);
        Assertions.assertFalse(order.isPaid());

        Mockito.verify(paymentService).processPayment(order);
    }
}