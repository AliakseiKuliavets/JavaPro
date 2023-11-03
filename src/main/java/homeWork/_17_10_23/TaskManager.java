package homeWork._17_10_23;

import java.util.LinkedList;
import java.util.List;

public class TaskManager<T extends Task>  {
    private final List<T> tasks = new LinkedList<>();
    public void addTask(T task) {
        tasks.add(task);
    }
    public double calculateTotalPayment() {
        double sum = 0;
        for (T task : tasks) {
            sum += task.calculatePayment();
        }
        return sum;
    }
}
