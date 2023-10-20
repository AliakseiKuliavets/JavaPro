package lesson.lesson14.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


public class Employee {
    private String name;
    private int salary;
    private String job;
    private Company company;

    public Employee(String name, int salary, String job, Company company) {
        this.name = name;
        this.salary = salary;
        this.job = job;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                ", company=" + company +
                '}';
    }
}
