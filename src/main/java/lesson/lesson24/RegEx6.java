package lesson.lesson24;

import com.github.javafaker.Faker;

public class RegEx6 {
    private static void info(Student student) {
        System.out.printf("%03d\t %-10s\t %-10s\t %,.1f\n",
                student.getId(), student.getName(), student.getSurName(), student.getSalary());
        // Формат чеков через пробелы      "001	 Paula     	 Funk      	 99,0"
    }

    public static void main(String[] args) {
        Faker faker = new Faker();
        Student student = new Student(1, faker.name().firstName(), faker.name().lastName(), 98.987783);
        info(student);
    }
}

class Student {
    private int id;
    private String name;
    private String surName;
    private double salary;

    public Student(int id, String name, String surName, double salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }
}
