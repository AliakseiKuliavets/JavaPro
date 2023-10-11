package lesson.lesson14.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Employee {
    private String name;
    private int salary;
    private String job;
    private Company company;
}
