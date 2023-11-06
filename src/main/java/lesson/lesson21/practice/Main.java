package lesson.lesson21.practice;

public class Main {

    //        1. Создайте класс Студент.
//        2. У студента должны быть характеристики: ID, имя, возраст, учебная степень (в виде Enum Degree - BACHELOR и MASTER).
//        3. Создайте класс СтудентСервис, где будет храниться список студентов и все методы для работы со студентами.
//        4. Список студентов в сервисе должен храниться в виде Map, где ключ - ID студента, значение - сам студент.
//        5. При создании студента не должно быть возможности присвоить ему идентификатор, вместо этого идентификатор должен присваиваться автоматически при создании студентов (то есть первому мы присваиваем автоматически ID 1, второму 2 и так далее). Этот функционал должен быть реализован при помощи СтудентСервиса.
//        6. Также при создании студента он должен автоматически добавляться в список студентов в сервисе.
//        7. Методы сервиса должны:
//                А. Возвращать список всех студентов.
//                Б. Возвращать количество студентов.
//                В. Возвращать количество студентов конкретной учебной степени (количество бакалавров или количество магистров).
//                Г. Возвращать средний возраст всех студентов.
//                Д. Возвращать средний возраст студентов конкретной учебной степени.
//                Е. Возвращать список студентов конкретной учебной степени.
//        8. Напишите модульные тесты на методы сервиса.

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.createStudent("John", 20, Degree.BACHELOR);
        service.createStudent("Alex", 22, Degree.MASTER);
        service.createStudent("Bob", 24, Degree.BACHELOR);
        service.createStudent("Ben", 26, Degree.MASTER);
        service.createStudent("Jack", 30, Degree.BACHELOR);

        System.out.println("Список всех студентов:");
        service.getAllStudents().forEach(System.out::println);
        System.out.println();

        System.out.println("Количество студентов: " + service.getStudentsCount());
        System.out.println("Количество бакалавров: "
                + service.getStudentsCountByDegree(Degree.BACHELOR));
        System.out.println("Средний возраст студентов: " + service.getStudentsAverageAge());
        System.out.println("Средний возраст магистров: "
                + service.getStudentsAverageAgeByDegree(Degree.MASTER));

        System.out.println();
        System.out.println("Список бакалавров:");
        service.getStudentsByDegree(Degree.BACHELOR).forEach(System.out::println);

        System.out.println();
        System.out.println("Студент с идентификатором 4: " + service.getStudentById(4));
    }
}