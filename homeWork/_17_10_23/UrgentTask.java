package homeWork._17_10_23;

import java.util.Date;

public class UrgentTask extends Task {

    public UrgentTask(String title, double reward) {
        super(title, new Date(), 1, reward);
    }

    public double calculatePayment() {
        if (getPriority() == 1) {
            return super.calculatePayment() * 2;
        }
        return super.calculatePayment();
    }
}
