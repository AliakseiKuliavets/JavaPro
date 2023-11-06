package lesson.lesson21.taski;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;
    @Mock
    private PaymentService paymentService;

    @Test
    public void placeOrderTrueTest() {
        Order order = new Order("1", 100.0, false);
        when(paymentService.processPayment(order)).thenReturn(true);

        orderService.placeOrder(order);
        Assertions.assertTrue(orderService.placeOrder(order));
        Assertions.assertTrue(order.isPaid());
//        verify(orderService).placeOrder(order);
    }
}