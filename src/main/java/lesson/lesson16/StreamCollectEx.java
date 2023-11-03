package lesson.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectEx {
    public static void main(String[] args) {
        List<String> list = Stream.of("A","S","D").collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = Stream.of(1,2,7,3,45,6,7,4,5,69,80).collect(Collectors.toSet());
        System.out.println(set);

        Map<Integer, String> map = Stream.of("mama","mylas","ram")
                .collect(Collectors.toMap(String::length, value -> value));
        System.out.println(map);

        MyCollection<Dog> dogMyCollection = Stream.of(
                new Dog("Bob",10),
                new Dog("Rex",8),
                new Dog("HOW",7)
        ).collect(MyCollection::new, MyCollection::add, MyCollection::addAll);
        System.out.println(dogMyCollection);

    }
}
class Dog{
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class MyCollection<T> extends ArrayList<T>{

}
