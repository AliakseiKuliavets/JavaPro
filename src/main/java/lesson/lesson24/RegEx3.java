package lesson.lesson24;

public class RegEx3 {
    public static void main(String[] args) {
        String text = "   mama    _myla      ramu";
        text = text.replaceAll(" {2,}", " ");  // заменяем все пробелы которые встречаются 2 и более раз
        // на 1 пробел
        System.out.println(text);
    }
}
