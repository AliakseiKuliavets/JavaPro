package lesson.lesson5.practice.task1;

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
}
