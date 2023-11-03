package summarySession.friday220923;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jenny");
        names.add("Mary");
        names.add("Jack");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
            if (current.equals("Mary")) {
                iterator.remove();
            }
        }
        for (String s : names) {
            System.out.println(s);
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(22);
        integers.add(33);
        integers.add(44);
        integers.add(55);
        integers.add(33);

        ListIterator<Integer> listIterator = integers.listIterator();
        while (listIterator.hasNext()) {
            Integer nextElem = listIterator.next();
            if (nextElem == 33) {
                listIterator.previous();
                listIterator.previous();
                listIterator.set(3000);
                listIterator.next();
                listIterator.next();
            }
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
