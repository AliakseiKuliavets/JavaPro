package homeWork._21_11_23;

public class MonitoringThread extends Thread {
    private final OrderManagementSystem orderManagementSystem;

    public MonitoringThread(OrderManagementSystem orderManagementSystem) {
        this.orderManagementSystem = orderManagementSystem;
    }

    @Override
    public void run() {
        while (orderManagementSystem.isRunning()) {
            monitorSystem();
        }
    }

    private synchronized void monitorSystem() {
        System.out.println("Система работает");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
