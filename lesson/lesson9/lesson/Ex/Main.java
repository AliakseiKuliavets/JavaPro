package lesson.lesson9.lesson.Ex;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(20,"Camel",true,'A');
        Animal animal2 = new Animal(25,"Shlange",false,'A');
        Animal animal3 = new Animal(2,"Horse",false,'B');
        Animal animal4 = new Animal(22,"Eagle",false,'A');
        Animal animal5 = new Animal(28,"Insekte",true,'C');
        Animal animal6 = new Animal(2,"Cat",false,'A');
        Animal animal7 = new Animal(3,"Dog",true,'A');
        Animal animal8 = new Animal(1,"Frog",true,'F');
        Animal animal9 = new Animal(1,"Spider",false,'B');
        Animal animal10 = new Animal(7,"Bird",false,'C');
        Animal animal11 = new Animal(8,"Bird",false,'B');

        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);
        animalSet.add(animal4);
        animalSet.add(animal5);
        animalSet.add(animal6);
        animalSet.add(animal7);
        animalSet.add(animal8);
        animalSet.add(animal9);
        animalSet.add(animal10);
        animalSet.add(animal11);

        System.out.println(animalSet);

        Methods methods = new Methods();
        System.out.println(methods.getSmallElem(animalSet));
        System.out.println(methods.getBigElem(animalSet));
        System.out.println(methods.getObjectContainingASpecificSubstring(animalSet,"Do"));
        System.out.println(methods.returnAllObjectsWhoseIntsAreOdd(animalSet));
    }
}
