package lesson.lesson2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private int age = 35;
    private String name = "Bob";
    //    Dog dog;
    private Animal animal;

    public Person() {
    }

    public Person(int age, String name, Animal animal) {
        this.age = age;
        this.name = name;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob");
        Person person = new Person(25, "Nmae", dog1);
        Person person1 = new Person();
        System.out.println(person);
        System.out.println(person1);
        Animal dog = new Dog("Tuzik");
        Person per = new Person(29, "Mike", dog);

    }
}

class Animal {

}

class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {
    private String name;
}
