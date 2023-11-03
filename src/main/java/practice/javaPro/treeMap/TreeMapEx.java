package practice.javaPro.treeMap;

import homeWork._07_09_23.Persons.Student;
import lombok.ToString;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Anton",14){
            @Override
            public String toString() {
                return "Name: " + getNamePerson() + ", age: " + getAgePeron();
            }
        }; // аннонимный метод
        Student student2 = new Student("Kirill",15);
        Student student3 = new Student("Egor",14);
        Student student4 = new Student("Anton",15);
        Student student5 = new Student("Kirill",16);
        Student student6 = new Student("Egor",15);
        treeMap.put(5.8,student1);
        treeMap.put(6.4,student2);
        treeMap.put(7.9,student5);
        treeMap.put(7.2,student3);
        treeMap.put(8.2,student6);
        treeMap.put(7.5,student4);
        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap()); // вывод в обратном порядке
//        System.out.println(treeMap.tailMap(7.0)); // вывести тех у кого ключ больше чем
//        System.out.println(treeMap.headMap(7.0)); // вывести тех у кого ключ меньше чем
//        System.out.println(treeMap.lastEntry()); // вывести у кого самый большой ключ
//        System.out.println(treeMap.firstEntry()); // вывести у кого самый маленький  ключ
    }
}
