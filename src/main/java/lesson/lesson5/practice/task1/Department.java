package lesson.lesson5.practice.task1;

import lombok.Getter;

import java.util.Arrays;
@Getter
public class Department {
    private final String nameOfDepartment;
    private final int numberOfDepartment;
    private  Employee[] employee;

    public Department(String nameOfDepartment, int numberOfDepartment, Employee[] employee) {
        this.nameOfDepartment = nameOfDepartment;
        this.numberOfDepartment = numberOfDepartment;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameOfDepartment='" + nameOfDepartment + '\'' +
                ", numberOfDepartment=" + numberOfDepartment +
                ", employee=" + Arrays.toString(employee) +
                '}';
    }
}
