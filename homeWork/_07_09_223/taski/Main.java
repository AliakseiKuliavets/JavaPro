package homeWork._07_09_223.taski;

import homeWork._07_09_223.taski.GradeMangementSustem.GradeManagementSystem;
import homeWork._07_09_223.taski.Persons.Student;
import homeWork._07_09_223.taski.Persons.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivan",59);
        Student student1 = new Student("Anton",14);
        Student student2 = new Student("Kirill",15);
        Student student3 = new Student("Egor",14);
        Student[] students = {student1,student2,student3};
        Teacher[] teachers = {teacher};
        GradeManagementSystem gradeStudents = new GradeManagementSystem(students,teachers);
        gradeStudents.gradeStudents(students, teacher);
        gradeStudents.processStudents(students);
    }
}
