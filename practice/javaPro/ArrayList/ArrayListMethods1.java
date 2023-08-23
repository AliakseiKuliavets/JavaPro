package practice.javaPro.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Aliaksei");
        arrayList1.add("Ivan");
        arrayList1.add("Bogdan");
        arrayList1.add(1,"Andrej"); // четко указать индекс
        System.out.println(arrayList1);

        System.out.println();

        System.out.println(arrayList1.get(2)); // вывод элемента по индексом

        arrayList1.set(1,"Kirill"); // замена элемента под индексом
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);

    }
}
