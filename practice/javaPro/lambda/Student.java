package practice.javaPro.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

}
