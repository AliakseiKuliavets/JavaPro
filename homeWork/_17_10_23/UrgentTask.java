package homeWork._17_10_23;

import java.util.Date;

public class UrgentTask extends Task {


    public UrgentTask(String title, Date deadline, int priority, double reward) {
        super(title, deadline, priority, reward);
    }

    public double calculatePayment() {
        if (getPriority() == 1) {
            return this.getReward() * 2;
        }
        return super.calculatePayment();
    }
}
