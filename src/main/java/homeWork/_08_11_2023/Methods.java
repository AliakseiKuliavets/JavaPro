package homeWork._08_11_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        String fileName = "D:\\tel_ran\\JavaPro\\src\\main\\java\\homeWork\\_08_11_2023\\1.txt";
        List<String> stringName = stringName(fileName);
        Map<Character, Long> characterLongMap = returnKeyStartNameLetterValueCount(stringName);

        System.out.println(stringName);
        System.out.println(characterLongMap);
        System.out.println(returnMostPopularLetterName(characterLongMap));
        System.out.println(returnFirstLongestName(stringName));
        System.out.println(returnFirstLastLetterName(stringName));
        System.out.println(returnAvgName(stringName));
    }

    public static List<String> stringName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            String input = stringBuilder.toString();

            String regex = "-\\s(\\p{L}+)\\s+(\\p{L}+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            List<String> namesList = new ArrayList<>();

            while (matcher.find()) {
                namesList.add(matcher.group(1));
            }

            return namesList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //2. Метод для создания мапы, где ключ - первая буква имени, а значение - количество таких имен
    public static Map<Character, Long> returnKeyStartNameLetterValueCount(List<String> stringName) {
        return stringName.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0), Collectors.counting()));
    }

    //3.Метод для нахождения самой часто встречающейся первой буквы в именах
    public static String returnMostPopularLetterName(Map<Character, Long> characterLongMap) {
        return characterLongMap.entrySet().stream()
                .min((el1, el2) -> Math.toIntExact(el2.getValue() - el1.getValue()))
                .toString();
    }

    //5.Метод для группировки имен по длине имени
    public static List<String> returnFirstLongestName(List<String> stringName) {
        return stringName.stream()
                .sorted((el1, el2) -> el2.length() - el1.length())
                .distinct()
                .collect(Collectors.toList());
    }

    //7. Метод для создания списка имен, отсортированного в обратном алфавитном порядке
    public static List<String> returnFirstLastLetterName(List<String> stringName) {
        return stringName.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
    }

    //9. Метод для расчета средней длины имени
    public static OptionalDouble returnAvgName(List<String> stringName) {
        return stringName.stream()
                .mapToInt(String::length)
                .average();
    }
}
