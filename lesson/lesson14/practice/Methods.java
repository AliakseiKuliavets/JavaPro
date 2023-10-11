package lesson.lesson14.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        List<String> va = list.stream()
                .filter(el -> el.contains("va"))
                .toList();
        System.out.println("Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.");
        System.out.println(va);
    }

    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .filter(el -> el % 2 == 0)
                .max();
        System.out.println(max);
    }

    public static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Jill", 40)
        );
        OptionalDouble j = people.stream()
                .filter(person -> person.getName().startsWith("J"))
                .mapToInt(Person::getAge)
                .average();
        System.out.println(j);
    }

    public static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language."
        );
        List<String> list = lines.stream()
                .flatMap(el -> Arrays.stream(el.split(" ")))
                .distinct()
                .toList();
        System.out.println(list);
    }

    public static void m5() {
        String ss = "KikJhYggfTgf";
        char[] charArray = ss.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char ch : charArray) {
            characterList.add(ch);
        }

        long countUpper = characterList.stream()
                .filter(Character::isUpperCase)
                .count();
        System.out.println("Подсчитать буквы верхнем регистре в стринге: " + countUpper);

        long countLower = characterList.stream()
                .filter(Character::isLowerCase)
                .count();
        System.out.println("Подсчитать буквы в нижнем регистре в стринге: " + countLower);
    }

    public static void m6() {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        Optional<Map.Entry<Integer, List<String>>> max = stream
                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
                .entrySet().stream().max(Map.Entry.comparingByKey());
        System.out.println(max);
    }

    public static void m7() {
        Company company1 = new Company("AAA","Berlin");
        Company company2 = new Company("ccc","Paris");

        List<Employee> employeeList = Arrays.asList(
                new Employee("Anton",20_000,"developer",company1),
                new Employee("Nikolay",15_000,"security",company1)
        );
    }

}
