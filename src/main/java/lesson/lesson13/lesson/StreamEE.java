package lesson.lesson13.lesson;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEE {
    public static void main(String[] args) {
        Faculty psy = new Faculty("PSY", 1);
        Faculty it = new Faculty("IT", 2);
        Faculty finance = new Faculty("FINANCE", 3);

        List<Faculty> psyAndIt = Arrays.asList(psy, it);
        List<Faculty> psyAndFinance = Arrays.asList(psy, finance);
        List<Faculty> itAndFinance = Arrays.asList(it, finance);

        Student s1 = new Student(17, "K", 9.8, psyAndIt);
        Student s2 = new Student(22, "D", 2.8, psyAndFinance);
        Student s3 = new Student(18, "G", 7.8, itAndFinance);
        Student s4 = new Student(21, "W", 6.8, itAndFinance);
        Student s5 = new Student(23, "F", 5.9, psyAndIt);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println(returnGradeStudents(studentList));
        System.out.println(getAllIds(studentList));
    }

    private static double returnGradeStudents(List<Student> studentList){
        return studentList.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }
    private static Set<Integer> getAllIds(List<Student> studentList){
        return studentList.stream()
                .flatMap(student -> student.getFaculty().stream())
                .map(Faculty::getId)
                .collect(Collectors.toSet());
    }
}

class Student {
    private int age;
    private String name;
    private double grade;

    private List<Faculty> faculty;

    public Student(int age, String name, double grade, List<Faculty> faculty) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }
}

class Faculty {
    private String facultyName;
    private int id;

    public Faculty(String facultyName, int id) {
        this.facultyName = facultyName;
        this.id = id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getId() {
        return id;
    }
}