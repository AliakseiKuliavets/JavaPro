package practice.javaPro.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(-100);
        arrayList.add(100);
        Collections.sort(arrayList); // сортирока массива по возрастанию [-100, -3, 0, 2, 8, 10, 100]
        System.out.println(arrayList);
        Collections.reverse(arrayList); // развернуть массив на оборот [100, 10, 8, 2, 0, -3, -100]
        System.out.println(arrayList);
        Collections.shuffle(arrayList); // мешать массив [8, -3, 2, 10, 100, 0, -100]
        System.out.println(arrayList);


//        int index = Collections.binarySearch(arrayList,8);
//        System.out.println(index);


//        Employee em1 = new Employee(100,"Ivan", 3900);
//        Employee em2 = new Employee(15,"Petr", 5400);
//        Employee em3 = new Employee(123,"Marina", 3500);
//        Employee em4 = new Employee(15,"Kolya", 6200);
//        Employee em5 = new Employee(182,"Sasha", 4800);
//        Employee em6 = new Employee(15,"Bogdan", 5000);
//        Employee em7 = new Employee(250,"Aliaksei", 5500);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(em1);
//        employeeList.add(em2);
//        employeeList.add(em3);
//        employeeList.add(em4);
//        employeeList.add(em5);
//        employeeList.add(em6);
//        employeeList.add(em7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index = Collections.binarySearch(employeeList, new Employee(15,"Kolya", 0));
//        System.out.println(index);


//        int[] array = {-3,2,5,6,10,45,0};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index = Arrays.binarySearch(array,6);
//        System.out.println(index);
    }
}
