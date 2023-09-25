package lesson.lesson9.lesson.Ex;

import lombok.Getter;

import java.util.Objects;
@Getter
public class Animal implements Comparable<Animal>{
    private final int age;
    private final String name;
    private final boolean sheSwims;
    private final char bloodType;

    public Animal(int age, String name, boolean sheSwims, char bloodType) {
        this.age = age;
        this.name = name;
        this.sheSwims = sheSwims;
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sheSwims=" + sheSwims +
                ", bloodType=" + bloodType +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && sheSwims == animal.sheSwims && bloodType == animal.bloodType && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sheSwims, bloodType);
    }
}
