package lesson.lesson18.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Person777 person777 = new Person777("Azino", 777);
        System.out.println("Before serial: ");
        System.out.println("Name: " + person777.getName());
        System.out.println("Age: " + person777.getAge());

        try (FileOutputStream outputStream = new FileOutputStream("person.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(person777);
            System.out.println("----DONE----");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
