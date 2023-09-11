package lesson.lesson2.example1;

import lesson.lesson2.example1.enums.AccessLevel;

public class Main {
    public static void main(String[] args) {
        Employee222 e1 = new Employee222("Bob", Department.SECURITY, AccessLevel.HIGH);
        Employee222 e2 = new Employee222("Paul", Department.HR, AccessLevel.MEDIUM);
        Employee222 e3 = new Employee222("Elena", Department.FINANCE, AccessLevel.MEDIUM);
        Employee222 e4 = new Employee222("Carl", Department.SALES, AccessLevel.LOW);
        Employee222[] employee222s = {e1,e2,e3,e4};

//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getAccessLevel() == (AccessLevel.HIGH)) {
//                System.out.println(employees[i].getName() + " go");
//            }
//        }

//        Department department = Department.valueOf("FINANCE");
//        System.out.println(department);
//
//        Department[] departments = Department.values();
//        System.out.println(Arrays.toString(departments));
    }
}
