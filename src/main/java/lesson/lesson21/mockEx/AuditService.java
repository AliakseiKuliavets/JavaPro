package lesson.lesson21.mockEx;

public interface AuditService {
    void logNewTrade(Trade trade);

}
interface TradingService {
    Long createTrade(Trade trade);
}

class Trade{
    String reference;
    String description;

    public Trade(String reference, String description) {
        this.reference = reference;
        this.description = description;
    }
}
