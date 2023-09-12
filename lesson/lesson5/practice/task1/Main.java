package lesson.lesson5.practice.task1;
public class Main {
    public static void main(String[] args) {
        Employee employee1DepSales = new Employee("Pasha", "Oryshchych",3500.99,1);
        Employee employee2DepSales = new Employee("Aliaksei", "Roronoa",2999.99,2);
        Employee employee3DepSales = new Employee("Walter", "Bruch",4000.99,3);
        Employee employee4DepSales = new Employee("Davud", "Kuliavets",3100.99,4);
        Employee[] employeeDepSales = {employee1DepSales,employee2DepSales,employee3DepSales,employee4DepSales};

        Employee employee1DepConstr = new Employee("Vladislav", "Gorin",2500.99,5);
        Employee employee2DepConstr = new Employee("Alexandr", "Karadiaur",1999.99,6);
        Employee employee3DepConstr = new Employee("Ruslan", "Vahner",3060.99,7);
        Employee employee4DepConstr = new Employee("Vasily", "Sokolov",3450.99,8);
        Employee[] employeeDepConstr = {employee1DepConstr,employee2DepConstr,employee3DepConstr,employee4DepConstr};

        Employee employee1DepSecur = new Employee("Van", "Helsing",4100.99,9);
        Employee employee2DepSecur = new Employee("Rudeus", "Greyrat",3100.99,10);
        Employee employee3DepSecur  = new Employee("Zoro", "Kuliavets",5100.99,11);
        Employee employee4DepSecur  = new Employee("Zoro", "Roronoa",5100.99,11);
        Employee[] employeeDepSecur = {employee1DepSecur,employee2DepSecur,employee3DepSecur,employee4DepSecur};

        Department departmentOfSales = new Department("Sales",123,employeeDepSales);
        Department departmentOfConstr = new Department("Construction",456,employeeDepConstr);
        Department departmentOfSecur = new Department("Construction",789,employeeDepSecur);
        Department[] departmentsOfSap = {departmentOfSales,departmentOfConstr,departmentOfSecur};

        Company companyOfSap = new Company("SAP","Berlin",departmentsOfSap);

        Processor processor = new Processor();
        System.out.println(processor.getAvgSalaryByDepartment(departmentOfSales)); // средняя зарплата департамента Sales
        System.out.println(processor.getMaxAvgSalaryByDepartment(companyOfSap)); // вывести департамент с самой высокой средней зп
        System.out.println(processor.getEmployeeWidthSimilarSurName(companyOfSap)); // работет только на 2 парные фамилии ,
        // т.е. если есть 2 одинаковые фамилии , если 3 и более то будет вывод пример (ABC: AB AC BC) ,это можно устранить с помощью MAP
        // но мы это еще не проходили
    }
}
