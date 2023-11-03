package homeWork._07_09_23.GradeMangementSustem;

import homeWork._07_09_23.Persons.Student;
import homeWork._07_09_23.Persons.Teacher;
import lombok.Getter;

@Getter
public class GradeManagementSystem {
    private final Student[] students;
    private final Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void gradeStudents(Teacher teacher) {
        // прохожусь циклом по массиву students и для каждого студента выставляю рандомную оценку
        for (Student student : students) {
            teacher.gradeStudent(student); // вызываю метод gradeStudent(student) для оценки в классе Teacher
        }
    }

    // данный метод выводит какие оценки выставил конкретный учитель каждому ученику
    public void processStudents(Teacher teacher) {
        // проверяю есть ли вообще студенты в классе
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        /*
          прохожусь циклом по массиву students и вывожу в консоль
          student.getDescription() - информация о студенте
          teacher.getDescription() - информация о учителе
          student.getGrade() - оценка студента
        */
        for (Student student : students) {
            System.out.println(student.getDescription() + teacher.getDescription() + student.getGrade());
        }
    }

    // вывод на экран информцию о каждом студенте
    public void processStudents() {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        for (Student student : students) {
            System.out.println(student.getDescription());
        }
    }

    // вывод на экран информцию о каждом учителе
    public void processTeachers() {
        if (teachers.length == 0) {
            System.out.println("Teachers empty");
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getDescription());
        }
    }
}