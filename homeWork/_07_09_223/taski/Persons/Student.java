package homeWork._07_09_223.taski.Persons;

import homeWork._07_09_223.taski.enums.Grade;
import homeWork._07_09_223.taski.interfac.Graded;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Person implements Graded, Comparable<Student>{

    private Grade grade;

    public Student(String namePerson, int agePeron) {
        super(namePerson, agePeron);
    }

    @Override
    public String getDescription() {
        return "Name student " + getNamePerson() + ", age student " + getAgePeron();
    }

    @Override
    public String getGrade() {
        return " grade " + grade + " }";
    }

    @Override
    public int compareTo(Student o) {
        return this.getGrade().compareTo(o.getGrade());
    }
}