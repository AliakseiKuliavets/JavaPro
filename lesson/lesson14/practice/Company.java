package lesson.lesson14.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


public class Company {
    private String name;
    private String city;

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
