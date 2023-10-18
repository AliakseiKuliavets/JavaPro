package lesson.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Param {
    List<String> list = new ArrayList<>();
}
class Gen <T> {
    public T getFirst(List<T> list){
        return list.get(0);
    }
    public static double sum(List<? extends  Number> list){
        double sum = 0.0d;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}
