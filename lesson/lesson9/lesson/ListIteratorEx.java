package lesson.lesson9.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('W');
        list.add('Z');
        list.add('Q');
        list.add('H');
        list.add('L');

        ListIterator<Character> characterListIterator = list.listIterator();

        while (characterListIterator.hasNext()) {
            System.out.println(characterListIterator.next());
        }

        System.out.println();

        ListIterator<Character> listReversIterator = list.listIterator(list.size());
        while (listReversIterator.hasPrevious()) {
            System.out.println(listReversIterator.previous());
        }
    }
}
