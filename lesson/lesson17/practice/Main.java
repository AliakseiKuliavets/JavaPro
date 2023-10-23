package lesson.lesson17.practice;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\tel_ran\\JavaPro\\lesson\\lesson17\\practice\\names.txt";
        List<String> listName = stringName(fileName);
        System.out.println(listName);
        String substring = "sa";
        int minLength = 2;
        int maxLength = 4;
        int n = 7;
        char c = 'A';

        System.out.println("Подсчет общего числа имен в файле: " + countTotalNames(listName));
        System.out.println("Нахождение уникальных имен в файле: " + uniqueNames(listName));
        System.out.println("Подсчет числа имен, содержащих заданную подстроку: "
                + countNamesContainingSubstring(listName, substring));
        System.out.println("Нахождение имен, длина которых находится в заданном диапазоне: "
                + namesWithLengthInRange(listName, minLength, maxLength));
        System.out.println("Вывод первых N имен в алфавитном порядке: " + firstNNamesAlphabetically(listName, n));
        System.out.println("Нахождение пяти самых часто встречающихся имен в файле: " + topFiveCommonNames(listName));
        System.out.println("Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз: "
                + namesStartingWithAndOccurMoreThanTwice(listName, c));
        System.out.println("Нахождение двух имен с самой длинной и самой короткой длиной: "
                + longestAndShortestNames(listName));
    }

    public static List<String> stringName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> listName = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                listName.add(line);
            }
            return listName;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //**Подсчет общего числа имен в файле
    public static long countTotalNames(List<String> listName) {
        return listName.size();
    }

    // **Нахождение уникальных имен в файле
    public static Set<String> uniqueNames(List<String> listName) {
        return new HashSet<>(listName);
    }

    //**Подсчет числа имен, содержащих заданную подстроку
    public static long countNamesContainingSubstring(List<String> listName, String substring) {
        return listName.stream()
                .filter(el -> el.contains(substring))
                .count();
    }

    //Нахождение имен, длина которых находится в заданном диапазоне
    public static List<String> namesWithLengthInRange(List<String> listName, int minLength, int maxLength) {
        return listName.stream()
                .filter(el -> el.length() > minLength && el.length() < maxLength)
                .toList();
    }

    //**Вывод первых N имен в алфавитном порядке
    public static List<String> firstNNamesAlphabetically(List<String> listName, int n) {
        return listName.stream()
                .sorted()
                .limit(n)
                .toList();
    }

    //Нахождение пяти самых часто встречающихся имен в файле
    public static List<String> topFiveCommonNames(List<String> listName) {
        return listName.stream()
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()))
                .entrySet().stream()
                .sorted((el1, el2) -> Math.toIntExact(el2.getValue() - el1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    //Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
    public static Set<String> namesStartingWithAndOccurMoreThanTwice(List<String> listName, char c) {
        return listName.stream()
                .filter(el -> el.startsWith(String.valueOf(c)))
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()))
                .entrySet().stream()
                .sorted((el1, el2) -> Math.toIntExact(el1.getValue() - el2.getValue()))
                .filter(el -> el.getValue() > 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    //Нахождение двух имен с самой длинной и самой короткой длиной
    public static Pair<String, String> longestAndShortestNames(List<String> listName) {
        String shortsValue = listName.stream()
                .min(Comparator.comparingInt(String::length))
                .toString();

        String longKey = listName.stream()
                .max(Comparator.comparingInt(String::length))
                .toString();

        return new Pair<>(longKey, shortsValue);
    }
}
