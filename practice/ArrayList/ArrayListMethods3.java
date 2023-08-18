package practice.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Aliaksei");
        arrayList1.add("Ivan");
        arrayList1.add("Bogdan");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("&&&");
        arrayList1.addAll(1,arrayList2); // обавляем в массив , следующий массив начиная с индекса
        System.out.println(arrayList1);
        int index = arrayList1.indexOf("Ivan"); // выводит индекс первого значения
        System.out.println(index);
        int indexLast = arrayList1.lastIndexOf("Ivan"); // выводит индекс последнего значения
        System.out.println(indexLast);
        System.out.println(arrayList1.size()); // размер массива
        System.out.println(arrayList1.contains("Bogdan")); // проверяет с выводом true || false есть ли такой обьект в массиве
        arrayList1.clear(); // очщиаем польностью массив
        System.out.println(arrayList1);
    }
}
