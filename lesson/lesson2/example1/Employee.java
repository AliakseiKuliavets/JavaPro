package lesson.lesson2.example1;

import lesson.lesson2.example1.enums.AccessLevel;
import lombok.Getter;

@Getter
public class Employee {
    private String name;
    private Department department;
    private AccessLevel accessLevel;

    public Employee(String name, Department department, AccessLevel accessLevel) {
        this.name = name;
        this.department = department;
        this.accessLevel = accessLevel;
    }
}
