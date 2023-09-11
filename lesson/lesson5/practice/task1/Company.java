package lesson.lesson5.practice.task1;

import lombok.Getter;

import java.util.Arrays;
@Getter
public class Company {
    private final String nameOfCompany;
    private final String cityOfCompany;
    private final Department[] departmentOfCompany;

    public Company(String nameOfCompany, String cityOfCompany, Department[] departmentOfCompany) {
        this.nameOfCompany = nameOfCompany;
        this.cityOfCompany = cityOfCompany;
        this.departmentOfCompany = departmentOfCompany;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", cityOfCompany='" + cityOfCompany + '\'' +
                ", departmentOfCompany=" + Arrays.toString(departmentOfCompany) +
                '}';
    }
}
