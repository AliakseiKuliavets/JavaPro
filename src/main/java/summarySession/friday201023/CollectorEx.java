package summarySession.friday201023;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","Anton","Edward","Anna","Anna");
        List<String> list = names.stream()
                .filter(el -> el.length() > 4)
//                .toList(); - UNMODIFIEBLE
//                .collect(Collectors.toList()); // - ArrayList по default но зависит от рандома
                .collect(Collectors.toCollection(LinkedList::new)); // - LinkedList - явно и конкретно создаем LinkedList
        System.out.println(list.getClass());
        list.add("Vasya");
        System.out.println(list);

//        Set<String> collect = names.stream()
////                .distinct() - если для List
//                .collect(Collectors.toSet());
        Set<String> collect2 = new HashSet<>(names);
        System.out.println(collect2);

        Map<String, Integer> collect = names.stream().
                collect(Collectors.toMap(s -> s, el-> 1, Integer::sum));
        System.out.println(collect.getClass());
        System.out.println(collect);

        Map<Integer,Long> lettersCount = names.stream().
                collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(lettersCount);

        Map<Integer,List<String>> groupByNameLength = names.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.toList()));
        System.out.println(groupByNameLength);
    }
}
