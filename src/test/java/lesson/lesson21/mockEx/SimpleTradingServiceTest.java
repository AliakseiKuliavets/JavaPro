package lesson.lesson21.mockEx;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
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
        TradingService tradingService = new SimpleTradingService(tradeRepository,auditService);
        tradingService.createTrade(trade);
        Mockito.verify(auditService).logNewTrade(trade);
    }
    @Test
    public void createTrade() {
    }
}