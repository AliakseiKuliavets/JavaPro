package homeWork._17_10_23;

import java.util.Date;

public class Task {
    private final String title;
    private final Date deadline;
    private final int priority;
    private final double reward;

    public Task(String title, Date deadline, int priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    public int getPriority() {
        return priority;
    }

    public double getReward() {
        return reward;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                ", reward=" + reward +
                '}';
    }

    public double calculatePayment() {
        if (getPriority() == 1) {
            return this.reward * 2;
        }
        return reward;
    }
}
