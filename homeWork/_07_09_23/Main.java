package homeWork._07_09_23;

import homeWork._07_09_23.GradeMangementSustem.GradeManagementSystem;
import homeWork._07_09_23.Persons.Student;
import homeWork._07_09_23.Persons.Teacher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan",59);
        Teacher teacher2 = new Teacher("Alexander",69);

        Student student1 = new Student("Anton",14);
        Student student2 = new Student("Kirill",15);
        Student student3 = new Student("Egor",14);

        Student[] students = {student1,student2,student3};
        Teacher[] teachers = {teacher1,teacher2};

        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem(students,teachers);

        System.out.println();
        gradeManagementSystem.processTeachers(); // вывод учителей
        System.out.println("--------------------------------------------------");

        gradeManagementSystem.gradeStudents(teacher2, students); // оценка преподователем учащихся
        gradeManagementSystem.processStudents(teacher2, students); // проверка для данного учителя и данной группы
        gradeManagementSystem.processStudents(students); // проверка всей группы данной группы
        Arrays.sort(students); // сортировка по grade
        gradeManagementSystem.processStudents(teacher2, students); // проверка для данного учителя и данной группы
        System.out.println("--------------------------------------------------");
        gradeManagementSystem.gradeStudents(teacher1, students); // оценка преподователем учащихся
        gradeManagementSystem.processStudents(teacher1, students); // проверка для данного учителя и данной группы
        gradeManagementSystem.processStudents(students); // проверка всей групп
        Arrays.sort(students); // сортировка по grade
        gradeManagementSystem.processStudents(teacher1, students); // проверка для данного учителя и данной группы
    }
}
