package practice.javaPro.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Aliaksei");
        arrayList1.add("Ivan");
        arrayList1.add("Bogdan");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(2); //указываем размер массива
        arrayList2.add("Aliaksei");
        arrayList2.add("Ivan");

        List<String> arrayList3 = new ArrayList<>(); // тоже создаем ArrayList
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1); // создаем копию массива 1

        ArrayList arrayList5 = new ArrayList(); // так делать не стоит
        arrayList5.add("Aliaksei");
        arrayList5.add("Ivan");
        arrayList5.add("Bogdan");
        arrayList5.add(55);
        arrayList5.add(new Car());
        System.out.println(arrayList5);
    }
}
class Car{}
