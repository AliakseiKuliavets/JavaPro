package lesson.lesson5.practice.task1;

import lombok.Getter;

@Getter
public class Employee {
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
}
