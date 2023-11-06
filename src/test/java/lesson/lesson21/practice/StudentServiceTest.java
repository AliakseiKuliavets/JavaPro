package lesson.lesson21.practice;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class StudentServiceTest {
    private StudentService service;

    @BeforeEach
    public void setUp() {
        service = new StudentService();
        service.clear();
        service.createStudent("Anton", 22, Degree.MASTER);
        service.createStudent("Kirill", 19, Degree.BACHELOR);
    }

    @Test
    public void checkCreateStudentPositiveTest() {
        service.createStudent("Sasha", 22, Degree.MASTER);
        Assertions.assertEquals(3, service.getAllStudents().size());
    }
    @Test
    public void checkCreateIDStudentPositiveTest() {
        Student student = service.createStudent("Sasha", 22, Degree.MASTER);
        Assertions.assertEquals(3, student.getId());
    }
    @Test
    public void checkCreateStudentReturnNotNullPositiveTest() {
        Student student = service.createStudent("Sasha", 22, Degree.MASTER);
        Assertions.assertNotNull(student);
    }
}