package practice.javaPro.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(12,"Anton","White",22_000);
        Employee emp4 = new Employee(12,"Anton","Hite",22_000);
        Employee emp2 = new Employee(2,"Kirill","Some",12_000);
        Employee emp3 = new Employee(24,"Zaur","Treug",32_000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
class Employee implements Comparable<Employee>{
    private final int id;
    private final String name;
    private final String surname;
    private final int salary;
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        return this.id - o.id;
//        return this.id.compareTo(o.id);
//        return this.name.compareTo(o.name);
        if (this.name.equals(o.name)){
            return this.surname.compareTo(o.surname);
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
