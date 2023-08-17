package practice.ArrayList;

import java.util.ArrayList;

public class ArraysListMethods2 {
    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 'm',22,3,8.3);
        Students st2 = new Students("Nikolay", 'm',28,2,6.4);
        Students st3 = new Students("Elena", 'f',19,1,8.9);
        Students st4 = new Students("Petr", 'm',35,4,7);
        Students st5 = new Students("Mariya", 'f',23,3,7.4);
        Students st6 = new Students("Mariya", 'f',23,3,7.4);
        ArrayList<Students> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        System.out.println();
        System.out.println(studentsList);
        studentsList.remove(st6);
        System.out.println(studentsList);
    }
}
