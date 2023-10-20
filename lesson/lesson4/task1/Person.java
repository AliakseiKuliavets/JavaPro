package lesson.lesson4.task1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private int age;
    private String name;
    private double salary;

    public Person() {
    }

    public Person(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Person o) {
//        return this.age - o.age; // по возрасту
        return this.name.compareTo(o.name); // по имени
    }
}


class Main {
    public static void main(String[] args) {
        Person p1 = new Person(25, "Bob",12_000);
        Person p2 = new Person(27, "Walter",10_000);
        Person p3 = new Person(30, "Vasily", 11_000);
        Person p4 = new Person(21, "Bogdan", 12_000);

//        Person[] persons = {p1,p2,p3,p4};
//        System.out.println(Arrays.toString(persons));
//        Arrays.sort(persons);
//
//        System.out.println(Arrays.toString(persons));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        System.out.println(personList);

        System.out.println(personList);
    }
}
