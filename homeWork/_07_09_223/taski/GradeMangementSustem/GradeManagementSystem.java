package homeWork._07_09_223.taski.GradeMangementSustem;


import homeWork._07_09_223.taski.Persons.Student;
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
        for (Student student : students) {
            student.setGrade(teacher.gradeStudent());
        }
    }

    public void processStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        for (Student student : students) {
            System.out.println(student.getDescription());
        }
    }

    public void processTeachers(Teacher[] teachers) {
        if (teachers.length == 0) {
            System.out.println("Classroom empty");
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getDescription());
        }
    }
}
