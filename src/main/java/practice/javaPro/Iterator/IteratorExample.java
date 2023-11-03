package practice.javaPro.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Aliaksei");
        arrayList1.add("Marina");
        arrayList1.add("Bogdan");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
        // вывод на экран , через итератор , через цикл
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        // удаляем все элементы массива
        while (iterator.hasNext()) {
            iterator.next();  // обязательно , важный метод next
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
