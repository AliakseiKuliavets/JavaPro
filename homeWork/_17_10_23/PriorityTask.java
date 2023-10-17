package homeWork._17_10_23;

import java.util.Date;

public class PriorityTask extends Task {
    private final int requiredPriority;

    public PriorityTask(String title, Date deadline, int priority, double reward, int requiredPriority) {
        super(title, deadline, priority, reward);
        this.requiredPriority = requiredPriority;
    }

    public double calculatePayment() {
        if (getPriority() == requiredPriority) {
            return this.getReward() * 2;
        }
        return 0;
    }
}
