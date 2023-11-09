package lesson.lesson21.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {
    @InjectMocks
    private PaymentService paymentService;

    @Mock
    private ExternalPaymentApi paymentApi;

    private static final Order order = new Order("123",20.0,true);

    @BeforeEach
    public void setUp(){
        paymentService = new PaymentService(paymentApi);
    }

    @Test
    public void processPaymentTrueAndTrue(){
        Mockito.when(paymentApi.requestPayment(order)).thenReturn(true);
        Mockito.when(paymentApi.verifyPayment(order.getId())).thenReturn(true);

        boolean result = paymentService.processPayment(order);

        Assertions.assertTrue(result);
        Mockito.verify(paymentApi).requestPayment(order);
        Mockito.verify(paymentApi).verifyPayment(order.getId());
    }

    @Test
    public void processPaymentTrueAndFalse(){
        Mockito.when(paymentApi.requestPayment(order)).thenReturn(true);
        Mockito.when(paymentApi.verifyPayment(order.getId())).thenReturn(false);

        boolean result = paymentService.processPayment(order);

        Assertions.assertFalse(result);
        Mockito.verify(paymentApi).requestPayment(order);
        Mockito.verify(paymentApi).verifyPayment(order.getId());
    }
}