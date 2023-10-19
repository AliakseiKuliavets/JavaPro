package homeWork._17_10_23;

import java.util.Date;

public class UrgentTask extends Task {


    public UrgentTask(String title, double reward) {
        super(title, new Date(), 1, reward * 2);
    }
}
