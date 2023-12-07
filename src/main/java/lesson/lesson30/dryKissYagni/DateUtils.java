package lesson.lesson30.dryKissYagni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String formatDateForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public static String formatTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }

    public static String formatDateTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}

class DateUtils2 {
    int dataStyle;

    // 1- dd/MM/yyyy
    // 2- HH:mm:ss
    // 3 -dd/MM/yyyy HH:mm:ss
    public static String formatDateForDisplay(Date date, int dataStyle) {
        if (dataStyle > 4 || dataStyle < 0) {
            return "Something  wrong";
        }
        SimpleDateFormat sdf;
        switch (dataStyle) {
            case 1:
                sdf = new SimpleDateFormat("dd/MM/yyyy");
                break;
            case 2:
                sdf = new SimpleDateFormat("HH:mm:ss");
                break;
            case 3:
                sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                break;
            default:
                return "Something  wrong";
        }
        return sdf.format(date);
    }
}