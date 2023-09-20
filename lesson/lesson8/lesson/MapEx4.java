package lesson.lesson8.lesson;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx4 {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(21,"Ab");
        map.put(2,"B2");
        map.put(13,"Cq");
        map.put(4,"Dq");
        map.put(15,"E12");
        System.out.println(map);

        Map<Car, String> carStringMap = new TreeMap<>();
        Car car1 = new Car("Tesla",false,1000);
        carStringMap.put(car1,"Tesla");
        System.out.println(carStringMap);
    }
}
@Getter
@ToString
class Car implements Comparable<Car>{
    private final String model;
    private final boolean isSport;
    private final int horsePower;
    public Car(String model, boolean isSport, int horsePower) {
        this.model = model;
        this.isSport = isSport;
        this.horsePower = horsePower;
    }
    @Override
    public int compareTo(Car o) {
        return this.horsePower-o.horsePower;
    }
}
