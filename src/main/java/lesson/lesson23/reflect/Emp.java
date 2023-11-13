
package lesson.lesson23.reflect;

public class Emp {
    public int id;
    public String name;
    public String department;
    private double salary;

    public Emp() {
    }

    public Emp(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Emp(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDep(String newDepName) {
        department = newDepName;
    }

    public void increase(){
        salary = salary * 1.25;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
