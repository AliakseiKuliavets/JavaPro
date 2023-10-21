package homeWork.summarySession._21_10_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = Arrays.asList(
                new Cat("Bob",false),
                new Cat("Murzik",true),
                new Cat("Kisulya",false)
        );
           /*
          public static void feed(List catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
    }
         */
        System.out.println("До изменения: " + catList);
        catList.forEach(el -> el.setHungry(true));
        System.out.println("После изменения: " +catList);

        /*
         public static int getSum(List integers) {
        int oddSum = 0;
        for(Integer i: integers) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }
         */
        List<Integer> listInteger = Arrays.asList(2,13,45,67,89,10,765,4,32);
        int sum = listInteger.stream()
                .filter(el -> el % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма нечетных числе: " + sum);

        /*
         public static <Map> getMap() {
        <Map> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }
         */
        Map<Boolean, List<Integer>> map = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0, Collectors.toList()));
        System.out.println(map);
    }
}
