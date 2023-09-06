package lesson.lesson4.task1;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
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

    @Override
    public int compareTo(Person o) {
//        return this.age - o.age; // по возрасту
        return this.name.compareTo(o.name); // по имени
    }
}
class SalaryComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
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

        Collections.sort(personList, new SalaryComparator());
        System.out.println(personList);
    }
}
