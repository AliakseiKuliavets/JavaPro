package lesson.lesson18.serial;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Student> listPerson = Arrays.asList(
                new Student("Anton", 23, 8.8),
                new Student("Kirill", 18, 7.8),
                new Student("Alex", 18, 9.7),
                new Student("Dan", 19, 6.4)
        );


        String fileName = "PersonListTXT.ser";
        saveStudentsToFile(listPerson, fileName);
        System.out.println(loadStudentsFromFile(fileName));

        double grade = 7.5;
        String fileName2 = "PersonList.ser";
        filterAndSaveStudentsByGrade(listPerson, grade, fileName2);
        System.out.println(calculateAverageGrade(fileName));
    }

    private static void saveStudentsToFile(List<Student> students, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(students);
            System.out.println("Serialization was done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Student> loadStudentsFromFile(String filename) {
        List<Student> newList;
        //Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            newList = (List<Student>) in.readObject();
            System.out.println("DE-Serialization was done");
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return newList;
    }

    private static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            for (Student student : students) {
                if (student.getGrade() >= gradeThreshold) {
                    out.writeObject(student);
                }
            }
            System.out.println("Serialization was done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static OptionalDouble calculateAverageGrade(String filename) {
        List<Student> newList;
        //Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            newList = (List<Student>) in.readObject();
            System.out.println("DE-Serialization was done");
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return newList.stream()
                .mapToDouble(Student::getGrade)
                .average();
    }
}