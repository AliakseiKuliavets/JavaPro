package lesson.lesson2.example1;

import lesson.lesson2.example1.enums.AccessLevel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bob", Department.SECURITY, AccessLevel.HIGH);
        Employee e2 = new Employee("Paul", Department.HR, AccessLevel.MEDIUM);
        Employee e3 = new Employee("Elena", Department.FINANCE, AccessLevel.MEDIUM);
        Employee e4 = new Employee("Carl", Department.SALES, AccessLevel.LOW);
        Employee[] employees = {e1,e2,e3,e4};

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
