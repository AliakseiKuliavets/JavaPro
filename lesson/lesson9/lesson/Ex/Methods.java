package lesson.lesson9.lesson.Ex;

import java.util.*;

public class Methods {
    //Создайте TreeSet и найдите наименьший и наибольший элементы (int) в нем, перебирая элементы внутри набора.
    public int getSmallElem(Set<Animal> animalSet) {
        Set<Animal> animals = new TreeSet<>(animalSet);
        int min = Integer.MAX_VALUE;
        for (Animal animal : animals) {
            if (animal.getAge() < min) {
                min = animal.getAge();
            }
        }
        return min;
    }

    public int getBigElem(Set<Animal> animalSet) {
        Set<Animal> animals = new TreeSet<>(animalSet);
        int max = Integer.MIN_VALUE;
        for (Animal animal : animals) {
            if (animal.getAge() > max) {
                max = animal.getAge();
            }
        }
        return max;
    }

    //Напишите метод, который принимает Set и находит все объекты, содержащие определенную подстроку(из поля стринг),
    // перебирая элементы и используя метод contains.
    public List<Animal> getObjectContainingASpecificSubstring(Set<Animal> animalSet, String s) {
        List<Animal> newAnimalList = new ArrayList<>();
        for (Animal animal : animalSet) {
            if (animal.getName().contains(s)) {
                newAnimalList.add(animal);
            }
        }
        return newAnimalList;
    }

    //Напишите метод, которая удаляет все четные инт из HashSet и выводит оставшиеся элементы. Используйте итератор.
    public Set<Animal> returnAllObjectsWhoseIntsAreOdd(Set<Animal> animalSet) {
        Iterator<Animal> iterator = animalSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() % 2 == 0) {
                iterator.remove();
            }
        }
        return animalSet;
    }

    //Создайте метод, который принимает два HashSet<Наш Класс> и возвращает новый HashSet,
    // содержащий элементы, которые присутствуют в обоих множествах
    public  HashSet<Animal> returSetContainElementThatArePresentInBothSet(Set<Animal> animalSet1, Set<Animal> animalSet2) {
        HashSet<Animal> result = new HashSet<>(animalSet1); // Создаем копию первого множества
        result.retainAll(animalSet2); // Оставляем только элементы, которые есть во втором множестве
        return result;
    }
}
