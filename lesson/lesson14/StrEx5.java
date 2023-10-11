package lesson.lesson14;

import lesson.lesson13.lesson1.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrEx5 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,34,56,78,654,32,1134,5,6);
        List<String> stringList = Arrays.asList("Mama", "Myla", "Ramu");
        int sum = list1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum all elements: " + sum);

        int sumHashCode = stringList.stream()
                .mapToInt(String::hashCode)
                .sum();
        System.out.println("Sum hashCode all String: " + sumHashCode);

        List<Em> emList = Arrays.asList(
                new Em("Nikolay","Osetrov",1290),
                new Em("Vladislav","Gorin",1500),
                new Em("Ivan","Burniachev",2000)
        );
        Map<String, List<Em>> collect = emList.stream()
                .collect(Collectors.groupingBy(em -> {
                    if (em.getSalary() < 1500) {
                        return "Low";
                    } else if (em.getSalary() <= 2000) {
                        return "Medium";
                    } else {
                        return "Hight";
                    }
                }));
        System.out.println(collect);

        List<String> list = stringList.stream()
                .flatMap(el -> Arrays.stream(el.split("")))
                .toList();
        System.out.println(list);
    }
}
@AllArgsConstructor
@Getter
@ToString
class Em {
    private String firstName;
    private String lastName;
    private double salary;

}
