package lesson.lesson14.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    //* Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
    public static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        List<String> va = list.stream()
                .filter(el -> el.contains("va"))
                .toList();
        System.out.println("Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.");
        System.out.println(va);
    }

    //     * Дан список целых чисел. Необходимо найти максимальный
    //     * элемент списка, который делится на заданное число без остатка.
    public static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .filter(el -> el % 2 == 0)
                .max();
        System.out.println("Максимальный элемент списка, который делится на заданное число без остатка: " + max);
    }

    //   * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
    //      * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
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
        System.out.println("Средний возраст людей, чьи имена начинаются на заданную букву: " + j);
    }

    //Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
    //       * этой коллекции строк, и вернуть их в виде списка.
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
        System.out.println("Все уникальные слова, которые содержатся в этой коллекции строк, и вернуть их в виде списка: " + list);
    }

    //Подсчитать буквы в нижнем и верхнем регистре
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

    //Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. Через Optional
    public static void m6() {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        Optional<Map.Entry<Integer, List<String>>> max = stream
                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
                .entrySet().stream().max(Map.Entry.comparingByKey());
        System.out.println("Все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional: " + max);
    }

    //       * Дан список сотрудников, у каждого из которых есть поле "salary".
//            * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
//            * в компаниях, которые находятся в городах, начинающихся на букву "M".
    public static void m7() {
        Company company1 = new Company("AAA", "Berlin");
        Company company2 = new Company("ccc", "Paris");
        Company company3 = new Company("DDD", "Munchen");

        List<Employee> employeeList = Arrays.asList(
                new Employee("Anton", 20_000, "developer", company1),
                new Employee("Igor", 10_000, "developer", company1),
                new Employee("Nikolay", 15_000, "security", company1),
                new Employee("SLava", 15_000, "developer", company2),
                new Employee("Kirill", 21_000, "developer", company2),
                new Employee("Andrei", 9_900, "security", company2),
                new Employee("Egor", 23_000, "developer", company3),
                new Employee("Dima", 18_000, "developer", company3),
                new Employee("Pavel", 15_000, "security", company3)
        );
        OptionalDouble average = employeeList.stream()
                .filter(employee -> employee.getCompany().getCity().startsWith("M"))
                .filter(employee -> employee.getJob().contains("developer"))
                .mapToInt(Employee::getSalary)
                .average();
        System.out.println("Средняя зарплата сотрудников, работающих на должности \"developer\"\n" +
                "в компаниях, которые находятся в городах, начинающихся на букву \"M\": " + average);
    }

    //   * У нас есть список списков numbers,
    //          * и мы хотим получить все четные числа из этих списков.
    //          * Мы используем flatMap, чтобы преобразовать каждый внутренний
    //          * список в поток чисел, а затем фильтруем только четные числа.
    //          * Результат: Even numbers: [2, 4, 6].
    public static void m8() {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> list = numbers.stream()
                .flatMap(List::stream)
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println("Получить все четные числа из этих списков: " + list);
    }

    /*
           * Есть два списка list1 и list2, и мы
           * хотим получить все возможные комбинации сумм чисел из обоих списков.
            * Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
           * затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
            * и наконец, собираем все значения в combinedList.
            * Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
    */
    public static void m9() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list = list1.stream()
                .flatMap(num1 -> list2.stream().map(num2 -> num1 + num2))
                .toList();
        System.out.println("Получить все возможные комбинации сумм чисел из обоих списков: " + list);
    }

}
