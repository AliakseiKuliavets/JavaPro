package lesson.lesson18.Person;

public class Person777 {
    private final String name;
    private final int age;

    public Person777(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person777{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
