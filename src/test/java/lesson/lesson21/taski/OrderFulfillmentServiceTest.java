package lesson.lesson21.taski;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrderFulfillmentServiceTest {
    @Mock
    private InventoryService inventoryService;

    private OrderFulfillmentService orderFulfillmentService;
}