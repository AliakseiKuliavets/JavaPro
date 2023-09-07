package homeWork._07_09_223.taski.GradeMangementSustem;

import homeWork._07_09_223.taski.Main;
import homeWork._07_09_223.taski.Persons.InfoStudent.Student;
import homeWork._07_09_223.taski.Persons.Person;
import homeWork._07_09_223.taski.Persons.Teacher;
import lombok.Getter;

@Getter
public class GradeManagementSystem {
    private final Student[] students;
    private final Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void gradeStudents(Student[] students, Teacher teacher) {
        teacher.getGradeStudent();
    }

    public void processStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + i + ":" + students[i]);
        }
    }

    public void processTeachers(Teacher[] teachers) {
        if (teachers.length == 0) {
            System.out.println("Classroom empty");
        }
        for (int i = 0; i < teachers.length; i++) {
            System.out.println("Student " + i + ":" + teachers[i]);
        }
    }
}
