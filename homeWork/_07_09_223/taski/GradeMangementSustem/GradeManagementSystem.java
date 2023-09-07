package homeWork._07_09_223.taski.GradeMangementSustem;

import homeWork._07_09_223.taski.Persons.Student;
import homeWork._07_09_223.taski.Persons.Teacher;
import lombok.Getter;

@Getter
public class GradeManagementSystem  {
    private final Student[] students;
    private final Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void gradeStudents() {
        for (Teacher teacher : teachers) {
            for (Student student : students) {
                teacher.gradeStudent(student);
            }
        }
    }

    public void processStudents() {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        for (Student student : students) {
            System.out.println(student.getDescription() + " " + student.getGrade());
        }
    }

    public void processTeachers() {
        if (teachers.length == 0) {
            System.out.println("Teachers empty");
        }
        for (Teacher teacher : teachers) {
            System.out.print(teacher.getDescription());
        }
    }
}