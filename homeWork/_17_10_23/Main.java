package homeWork._17_10_23;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2023, Calendar.NOVEMBER,17,10,27);
        Task task1 = new Task("HW",date, 1,10_000);
        UrgentTask urgentTask = new UrgentTask("HW",date, 1,10_000);
        System.out.println(urgentTask.calculatePayment());

    }
}
