package lesson.lesson21.mockEx;

import java.util.HashMap;
import java.util.Map;

public class SimpleTradingService implements TradingService{
    TradeRepository tradeRepository;
    AuditService auditService;

    public SimpleTradingService(TradeRepository tradeRepository, AuditService auditService) {
        this.tradeRepository = tradeRepository;
        this.auditService = auditService;
    }

    @Override
    public Long createTrade(Trade trade) throws CreateTradeException {
        Long id = tradeRepository.createTrade(trade);
        auditService.logNewTrade(trade);
        return id;
    }
}
class TradeRepository{
    Map<Long,Trade> trades = new HashMap<>();
    public void addTrade(Long id, Trade trade){
        trades.put(id,trade);
    }
    public Long createTrade(Trade trade){
        long id = trades.size()+1;
        addTrade(id,trade);
        return id;
    }
}
