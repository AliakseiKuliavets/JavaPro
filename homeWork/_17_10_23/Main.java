package homeWork._17_10_23;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager<Task> taskManager = new TaskManager<>();

        Task task1 = new Task("HW with Algorithm", new Date(), 3, 10_000);
        UrgentTask urgentTask = new UrgentTask("HW with DataBase", new Date(),2,10_000);
        PriorityTask priorityTask = new PriorityTask("HW with JAVA", new Date(), 1, 10_000, 1);

        taskManager.addTask(task1);
        taskManager.addTask(urgentTask);
        taskManager.addTask(priorityTask);

        System.out.println("Total Payment: " + taskManager.calculateTotalPayment());
    }
}
