package lesson.lesson21.mockEx;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyLong;


class SimpleTradingServiceTest {
    @Mock
    private AuditService auditService;
    @Mock
    private TradeRepository tradeRepository;
    @Mock
    private Trade trade;

    @Test
    public void logNewTradeWithMockTest(){
        Mockito.when(tradeRepository.createTrade(trade)).thenReturn(anyLong());

    }
    @Test
    public void createTrade() {
    }
}