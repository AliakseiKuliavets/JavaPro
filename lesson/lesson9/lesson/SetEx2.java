package lesson.lesson9.lesson;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Ob ob1 = new Ob("Dmitri", 47);
        Ob ob2 = new Ob("Ruslan", 32);
        Ob ob3 = new Ob("Dmitri", 22);
        Ob ob4 = new Ob("Dmitri", 22);
        Ob ob5 = new Ob("Aliaksei", 22);

        Set<Ob> obSet = new HashSet<>();
        obSet.add(ob1);
        obSet.add(ob2);
        obSet.add(ob3);
        obSet.add(ob4);
        obSet.add(ob5);

        System.out.println(obSet);
    }
}
class Ob implements Comparable<Ob>{
    private final String name;
    private int age;

    public Ob(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Ob o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ob ob = (Ob) o;
        return Objects.equals(name, ob.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ob{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
