package lesson.lesson5.practice.task1;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Employee{
    private final String nameOfEmployee;
    private String surNameOfEmployee;
    private double salaryOfEmployee;
    private int idOfEmployee;

    public Employee(String nameOfEmployee, String surNameOfEmployee, double salaryOfEmployee, int idOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
        this.surNameOfEmployee = surNameOfEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
        this.idOfEmployee = idOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", surNameOfEmployee='" + surNameOfEmployee + '\'' +
                ", salaryOfEmployee=" + salaryOfEmployee +
                ", idOfEmployee=" + idOfEmployee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surNameOfEmployee, employee.surNameOfEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surNameOfEmployee);
    }
}
