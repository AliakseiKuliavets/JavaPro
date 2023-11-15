package lesson.lesson24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String text = "ABCDABCDE AB8CD ABC ABCDAB ABCF ABCDABCDEF ABF";
//        Pattern pattern = Pattern.compile("ABC");
//        Pattern pattern = Pattern.compile("AB[C-Y]");
//        Pattern pattern = Pattern.compile("AB[C-Y0-9]"); // входящий в диапазон
//        Pattern pattern = Pattern.compile("AB[^C-Y0-9]"); // ^ (любой символ и цифр не входящий в диапазон)
//        Pattern pattern = Pattern.compile("AB(C | 8)"); // 3 символ может быть C или 8
//        Pattern pattern = Pattern.compile("AB."); // любой символ после AB
//        Pattern pattern = Pattern.compile("[0-9]"); // все цифры от 0 до 9
//        Pattern pattern = Pattern.compile("\\d"); // экранирование вывод только одной цифре
//        Pattern pattern = Pattern.compile("\\D"); // экранирование вывод не цифр
//        Pattern pattern = Pattern.compile("\\w"); // вывод одного символа буква цифра и "_" все остальное не выводит
//        Pattern pattern = Pattern.compile("\\W"); // вывод не выводит буквы, цифры и "_"
//        Pattern pattern = Pattern.compile("\\s"); // вывод пробелы
//        Pattern pattern = Pattern.compile("\\S"); // вывод не пробелы
//        Pattern pattern = Pattern.compile("\\w+"); // можно разбивать до пробелов на слова
//        Pattern pattern = Pattern.compile("\\w{4}"); // берет все до 4 символов
//        Pattern pattern = Pattern.compile("\\b}"); // граница String
//        Pattern pattern = Pattern.compile("\\b\\w{4}\\b"); // граница String вывод только слова состоящих из 4 символов
        Pattern pattern = Pattern.compile("\\+\\w{3}"); // Находит символа буква цифра и "_" только впереди обяз +
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}
