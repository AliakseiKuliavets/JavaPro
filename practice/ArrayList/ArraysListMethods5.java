package practice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Aliaksei");
        arrayList1.add("Marina");
        arrayList1.add("Bogdan");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        List<Integer> list1 = List.of(3,8,13); // создания массива без метода .add (!! массив данный мадификации не подлежит)
        System.out.println(list1);
//        list1.add(100); // ошибка

        List<String> list2 = List.copyOf(arrayList1); // делает копию но тоже без модификации , и не могут содержать NULL
        System.out.println(list2);


//        Object[] array = arrayList1.toArray(); // получить массив обьектов
//        String[] array2 = arrayList1.toArray(new String[arrayList1.size()]);
//        System.out.println(Arrays.toString(array2));
//



//        List<String> myList = arrayList1.subList(1, 4);
//        // показать элементы с n ндекса до m не включая m , важно
//        // понимать что это тольок вид , он связан с тем массивом от котрого был связан
//        System.out.println(myList);
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(arrayList1);
//        arrayList1.add("Svetlana");
//        System.out.println(arrayList1);
//        System.out.println(myList);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Igor");
//        arrayList2.add("Marina");

//        arrayList1.removeAll(arrayList2); // удаляет элементы похожие на элементы в другом массиве
//        arrayList1.retainAll(arrayList2); // оставит элементы похожие на элементы в другом массиве
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);// содержит ди все элементы массива 2 в массиве 1
//        System.out.println(result);


    }
}
