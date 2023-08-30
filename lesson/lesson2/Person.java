package lesson.lesson2;

public class Person {
    int age;
    String name;
//    Dog dog;
    Animal animal;
    public Person() {
    }

    public Person(int age, String name, Animal animal) {
        this.age = age;
        this.name = name;
        this.animal = animal;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob");
        Person person = new Person(25,"Nmae", dog1);
    }
}

class Animal{

}
class Dog extends Animal{
    String name;

    public Dog(String name) {
        this.name = name;
    }
}

class Cat extends Animal{
    String name;
}
