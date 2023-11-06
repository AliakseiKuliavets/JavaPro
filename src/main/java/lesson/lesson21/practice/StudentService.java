package lesson.lesson21.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {

    //        3. Создайте класс СтудентСервис, где будет храниться список студентов
    //        и все методы для работы со студентами.
//        4. Список студентов в сервисе должен храниться в виде Map,
//        где ключ - ID студента, значение - сам студент.
//        5. При создании студента не должно быть возможности присвоить ему идентификатор,
//        вместо этого идентификатор должен присваиваться автоматически
//        при создании студентов (то есть первому мы присваиваем автоматически ID 1,
//        второму 2 и так далее). Этот функционал должен быть реализован
//        при помощи СтудентСервиса.
//        6. Также при создании студента он должен автоматически добавляться
//        в список студентов в сервисе.

    private Map<Integer, Student> students = new HashMap<>();
    private int currentId;

    public Student createStudent(String name, int age, Degree degree) {
        Student student = new Student(++currentId, name, age, degree);
        students.put(currentId, student);
        return student;
    }

//        7. Методы сервиса должны:
//                А. Возвращать список всех студентов.

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

//                Б. Возвращать количество студентов.

    public int getStudentsCount() {
        return students.size();
    }

//                В. Возвращать количество студентов конкретной учебной степени
//                (количество бакалавров или количество магистров).

    public long getStudentsCountByDegree(Degree degree) {
        return students.values().stream().filter(x -> x.getDegree().equals(degree)).count();
    }

//                Г. Возвращать средний возраст всех студентов.

    public double getStudentsAverageAge() {
        return students.values().stream().mapToInt(Student::getAge).average().orElse(0);
    }

//                Д. Возвращать средний возраст студентов конкретной учебной степени.

    public double getStudentsAverageAgeByDegree(Degree degree) {
        return students.values().stream()
                .filter(x -> x.getDegree().equals(degree))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);
    }

//                Е. Возвращать список студентов конкретной учебной степени.

    public List<Student> getStudentsByDegree(Degree degree) {
        return students.values().stream().filter(x -> x.getDegree().equals(degree)).toList();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }
}