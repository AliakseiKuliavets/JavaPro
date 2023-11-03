package summarySession.friday201023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    public static void main(String[] args) {
        List<Monkey> monkeyList = Arrays.asList(
                new Monkey("A", 3, "grey", false, 10.9),
                new Monkey("A", 2, "white", true, 10.1),
                new Monkey("T", 3, "grey", false, 5),
                new Monkey("J", 2, "black", true, 7),
                new Monkey("Y", 1, "grey", true, 6)
        );
        //Получить Map имя / информация, голодна ли обезьянка
        Map<String, Boolean> mapHungry1 = monkeyList.stream()
                .collect(Collectors.toMap(Monkey::getName, Monkey::isHungry, (x, y) -> x));
        System.out.println("Вывод по именам голодные ли нет: " + mapHungry1);
        // я сделал еще с листом , потому что если имена совпадут , то какая будет голодна а какая то нет
        Map<Boolean, List<String>> mapHungry = monkeyList.stream()
                .collect(Collectors.groupingBy(Monkey::isHungry, Collectors.mapping(Monkey::getName, Collectors.toList())));
        System.out.println("Вывод голодные или нет по именам в листе: " + mapHungry);


        //Получить Map цвет / количество обезьян данного цвета
        Map<String, Long> mapColorCount = monkeyList.stream()
                .collect(Collectors.groupingBy(Monkey::getColour, Collectors.counting()));
        System.out.println("Вывод  количество обезьян по цвету : " + mapColorCount);

        //Получить Map цвет / список имен обезьян данного цвета
        Map<String, List<String>> mapColorNameList = monkeyList.stream()
                .collect(Collectors.groupingBy(Monkey::getColour, Collectors.mapping(Monkey::getName, Collectors.toList())));
        System.out.println("Вывод по цвету имен в листе: " + mapColorNameList);

        //Создать компаратор и отсортировать исходный список по весу
        List<Monkey> monkeyListComparWeight = monkeyList.stream()
                .sorted(Comparator.comparingDouble(Monkey::getWeight))
                .toList();
        System.out.println("Сортировка по весу: " + monkeyListComparWeight);

        //Создать компаратор и отсортировать исходный список по имени
        List<Monkey> monkeyListComparName = monkeyList.stream()
                .sorted(Comparator.comparing(Monkey::getName))
                .toList();
        System.out.println("Сортировка по имени: " + monkeyListComparName);
    }
}
