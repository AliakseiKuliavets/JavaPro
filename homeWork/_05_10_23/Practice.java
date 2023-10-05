package homeWork._05_10_23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Practice {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 23, 456, 78, 9, 9, 9, 9, 8, 30, 45);
        List<String> listString = Arrays.asList("1", "23", "456", "78", "9", "8");
        List<String> listStringText = Arrays.asList("adasdad", "zdzddz", "accss", "bbgbg", "qwewe", "mj", "accss");
        Student student1 = new Student(20, "Aliaksei");
        Student student2 = new Student(23, "Bogdan");
        Student student3 = new Student(18, "Kirill");
        List<Student> studentList = Arrays.asList(student1, student2, student3);

        //: Фильтрация списка целых чисел на нечетные числа
        List<Integer> list1 = listInteger.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println("Список целых нечетные числа " + list1);
        System.out.println("----------------------------------------------------------");

        // Преобразование списка строк в список чисел
        List<Integer> list2 = listString.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Cписка строк в список чисел " + list2);
        System.out.println("----------------------------------------------------------");

        // Суммирование списка чисел
        AtomicInteger n = new AtomicInteger();
        listInteger.forEach(n::addAndGet);
        System.out.println("Сумма всех элементов: " + n);
        System.out.println("----------------------------------------------------------");

        // Определение максимального значения в списке
        String string = listInteger.stream()
                .max(Comparator.comparingInt(el -> el))
                .stream().findFirst()
                .toString();
        System.out.println("Определение максимального значения в списке " + string);
        System.out.println("----------------------------------------------------------");

        //Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> a = listStringText.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Список строк начинаются на { a } и преобразование в верхний регистр " + a);
        System.out.println("----------------------------------------------------------");

        //Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> list3 = listStringText.stream()
                .filter(el -> el.length() > 4)
                .distinct()
                .toList();
        System.out.println("Список уникальных слов длинной больше 4 " + list3);
        System.out.println("----------------------------------------------------------");

        //Преобразование списка объектов класса в список их имен, отсортированных по возрасту------
        List<String> list4 = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .map(Student::getName)
                .toList();
        System.out.println("Список всех студентов без сортировки " + studentList);
        System.out.println("Список имен отсортированных по возврсату " + list4);
        System.out.println("----------------------------------------------------------");

        // Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        int sum = listInteger.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма чисел, кратных 3 и 5: " + sum);
        System.out.println("----------------------------------------------------------");

        //Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> collect = listStringText.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .toList();
        System.out.println("Список слов содержащий тольок уникальные символы " + collect);
    }
}
