package practice.ArrayList;

import java.util.Objects;

public class Students {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Students(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sex == students.sex &&
                age == students.age &&
                course == students.course &&
                Double.compare(students.avgGrade, avgGrade) == 0 && Objects.equals(name, students.name);
    }
}
