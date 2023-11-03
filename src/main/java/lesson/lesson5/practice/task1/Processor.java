package lesson.lesson5.practice.task1;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    public double getAvgSalaryByDepartment(Department department) {
        int salary = 0;
        for (int i = 0; i < department.getEmployee().length; i++) {
            salary += department.getEmployee()[i].getSalaryOfEmployee();
        }
        return (double) salary / department.getEmployee().length;
    }

    public Department getMaxAvgSalaryByDepartment(Company company) {
        int maxSalary = 0;
        Department depo = new Department(" ", 1, new Employee[1]);
        for (int i = 0; i < company.getDepartmentOfCompany().length; i++) {
            if (getAvgSalaryByDepartment(company.getDepartmentOfCompany()[i]) > maxSalary) {
                depo = company.getDepartmentOfCompany()[i];
            }
        }
        return depo;
    }

    public List<Employee> getEmployeeWidthSimilarSurName(Company company) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> employeesEquals = new ArrayList<>();
        for (int i = 0; i < company.getDepartmentOfCompany().length; i++) {
            for (int j = 0; j < company.getDepartmentOfCompany()[i].getEmployee().length; j++) {
                employees.add(company.getDepartmentOfCompany()[i].getEmployee()[j]);
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getSurNameOfEmployee().equals(employees.get(j).getSurNameOfEmployee())) {
                    employeesEquals.add(employees.get(j));
                    employeesEquals.add(employees.get(i));
                }
            }
        }
        return employeesEquals;
    }
}
