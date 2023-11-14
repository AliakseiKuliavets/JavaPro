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
        List<String> stringListName = stringName(fileName);
        List<String> stringListLastName = Arrays.asList("Edwards","Edwards", "Herman", "Blake", "Griffin", "Mitchell");
        List<String> stringsNumberPhone = Arrays.asList("+1-240-701-5763x6875", "(432)461-5121", "+1-159-322-4388x60509");
        Map<Character, Long> characterLongMap = returnKeyStartNameLetterValueCount(stringListName);

        System.out.println(returnUniqueLastName(stringListLastName));
    }

    public static List<String> stringName(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("Переданная ссылка на файл не может быть NULL");
        }
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

    public static List<String> stringLastName(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("Переданная ссылка на файл не может быть NULL");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            String input = stringBuilder.toString();

            String regex = "";
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
    public static Map<Character, Long> returnKeyStartNameLetterValueCount(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0), Collectors.counting()));
    }

    //3.Метод для нахождения самой часто встречающейся первой буквы в именах
    public static String returnMostPopularLetterName(Map<Character, Long> characterLongMap) {
        if (characterLongMap == null || characterLongMap.isEmpty()) {
            throw new IllegalArgumentException("Map не должна быть пустой или равна NULL");
        }
        return characterLongMap.entrySet().stream()
                .min((el1, el2) -> Math.toIntExact(el2.getValue() - el1.getValue()))
                .toString();
    }

    //4.Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
    public static List<Long> returnInLongNumberPhone(List<String> stringsNumberPhone) {
        if (stringsNumberPhone == null || stringsNumberPhone.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        List<Long> integerList = new ArrayList<>();
        for (String number : stringsNumberPhone) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < number.length(); j++) {
                if (Character.isDigit(number.charAt(j))) {
                    stringBuilder.append(number.charAt(j));
                }
                if (j == number.length() - 1) {
                    integerList.add(Long.parseLong((String.valueOf(stringBuilder))));
                }
            }
        }
        return integerList;
    }

    //5.Метод для группировки имен по длине имени
    public static List<String> returnSortedLengthName(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    //6.Метод для поиска уникальных фамилий
    public static List<String> returnUniqueLastName(List<String> stringListLastName) {
        if (stringListLastName == null || stringListLastName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListLastName.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //7. Метод для создания списка имен, отсортированного в обратном алфавитном порядке
    public static List<String> returnFirstLastLetterAlphabetName(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
    }

    //9. Метод для расчета средней длины имени
    public static Double returnAvgLengthName(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .mapToInt(String::length)
                .average()
                .orElse(-1);
    }
}
