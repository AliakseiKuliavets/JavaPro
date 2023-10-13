package summarySession.friday131023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("AAA","Aaaa","aAAA","adad","bgfbrft","Bsa");
        for (String s: stringList){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 4, 22, 55);
        List<String> list1 = list.stream()
                .filter(el -> el % 2 == 0)
                .peek(el -> System.out.println("Промежуток: " + el))
                .map(el -> "Filtered result: " + el)
                .toList();
        System.out.println(list1);

        List<String> group1 = Arrays.asList("Anton","Kirill", "Bogdan");
        List<String> group2 = Arrays.asList("Tatiana","Ruslan", "Walter");
        List<List<String>> listList = Arrays.asList(group1,group2);
        List<String> list2 = listList.stream()
                .flatMap(group -> group.stream())
                .toList();
        System.out.println(list2);

        group1.stream()
                .flatMap(s -> s.chars().boxed())
                .map(Character::toString)
                .forEach(System.out::println);

    }
}
