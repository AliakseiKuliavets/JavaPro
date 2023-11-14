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
        List<String> lines = readFileToList(fileName);
        List<String> stringListName = stringName(lines);
//        System.out.println(stringListName);
        List<String> stringListLastName = stringLastName(lines);
//        System.out.println(stringListLastName);
        System.out.println(lines);
        List<String> stringsNumberPhone = stringsNumberPhone(lines);
        System.out.println(stringsNumberPhone);
        Map<Character, Long> characterLongMap = returnKeyStartNameLetterValueCount(stringListName);


    }

    public static List<String> readFileToList(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("Переданная ссылка на файл не может быть NULL");
        }
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }

        return lines;
    }

    public static List<String> stringName(List<String> lines) {
        if (lines == null || lines.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        String regex = "-\\s(\\p{L}+)\\s+(\\p{L}+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> namesList = new ArrayList<>();

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                namesList.add(matcher.group(1));
            }
        }
        return namesList;
    }

    public static List<String> stringLastName(List<String> lines) {
        if (lines == null || lines.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        String regex = "\\p{L}+$";
        Pattern pattern = Pattern.compile(regex);

        List<String> lastNamesList = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split("\\s+");
            if (parts.length > 1) {
                String lastName = parts[parts.length - 1];
                Matcher matcher = pattern.matcher(lastName);

                if (matcher.find()) {
                    lastNamesList.add(matcher.group());
                }
            }
        }
        return lastNamesList;
    }

    public static List<String> stringsNumberPhone(List<String> lines) {
        if (lines == null || lines.isEmpty()) {
            throw new IllegalArgumentException("Список строк не должен быть пустым или равен null");
        }
        String regex = "[+\\d().-]+x?\\d*";
        Pattern pattern = Pattern.compile(regex);

        List<String> phoneNumbersList = new ArrayList<>();

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String phoneNumber = matcher.group().replaceAll("[^0-9]", "");
                phoneNumbersList.add(phoneNumber);
            }
        }
        phoneNumbersList.removeIf(String::isEmpty);

        return phoneNumbersList;
    }


    //2. Метод для создания Map, где ключ - первая буква имени, а значение - количество таких имен
    public static Map<Character, Long> returnKeyStartNameLetterValueCount(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0), Collectors.counting()));
    }

    //3. Метод для нахождения самой часто встречающейся первой буквы в именах
    public static String returnMostPopularLetterName(Map<Character, Long> characterLongMap) {
        if (characterLongMap == null || characterLongMap.isEmpty()) {
            throw new IllegalArgumentException("Map не должна быть пустой или равна NULL");
        }
        return characterLongMap.entrySet().stream()
                .min((el1, el2) -> Math.toIntExact(el2.getValue() - el1.getValue()))
                .toString();
    }

    //4. Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
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

    //5. Метод для группировки имен по длине имени
    public static List<String> returnSortedLengthName(List<String> stringListName) {
        if (stringListName == null || stringListName.isEmpty()) {
            throw new IllegalArgumentException("Лист имен не должен быть пустой или равен NULL");
        }
        return stringListName.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    //6. Метод для поиска уникальных фамилий
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
