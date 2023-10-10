package lesson.lesson13.lesson1;

import java.util.*;

public class EX {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        List<String> words2 = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));

        List<Integer> list = numbers.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println("Отфильтровать на четные" + list);
        List<Integer> list1 = numbers.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println("Отфильтровать на не четные" + list1);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Просуммировать все числа: " + sum);

        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println("Получить среднее значение: " + average);

        List<Integer> list2 = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .toList();
        System.out.println("Найти суммы чисел кратных 3 и 5: " + list2);

        List<Integer> list3 = strings.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Преобразовать список строк в список чисел: " + list3);

        List<String> a = words.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр");
        System.out.println(a);

        List<String> list4 = words.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .toList();
        System.out.println("Получить список слов которые содержат только уникальные символы: " + list4);

        Integer integer = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("Определение максимального значения в списке: " + integer);

        List<String> list5 = words2.stream()
                .filter(el -> el.length() > 4)
                .distinct()
                .toList();
        System.out.println("Получение списка уникальных слов из списка строк, длина которых больше 4 символов");
        System.out.println(list5);

        List<String> list6 = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .toList();
        System.out.println("Преобразование списка объектов класса в список их имен, отсортированных по возрасту");
        System.out.println(list6);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        long count1 = numbers1.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .count();
        System.out.println("Подсчет количества уникальных четных и нечетных чисел: " + count1);

        String m = "ASDFGHJzcxvbn";
        char[] charArray = m.toCharArray();
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

        //Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional
    }
}

