package lesson.lesson4.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(2,200.0,129_999.99, "Berlin");
        House house2 = new House(2,120.5,129_999.99, "Paris");
        House house3 = new House(3,300.0,1_099_999.99, "New York");
        House house4 = new House(4,90.0,649_999.99, "London");

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println(houses);
        Collections.sort(houses);
        System.out.println(houses);
    }
}
